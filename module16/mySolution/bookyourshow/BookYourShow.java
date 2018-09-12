class BookYourShow{
	Show[] shows;
	int count = 0;

	BookYourShow(){
		shows = new Show[10];
		count = 0;
	}

	public void addAShow(Show s){
		shows[count++] =  s;
		//System.out.println(shows[count-1]);

	}
	public Show getAShow(String name, String date){
		for(Show s : shows){
			if(s!=null){
				if(s.movieName.equals(name) && s.movieTime.equals(date)){
					return s;
				}
			}
		}
		return null;
	}
	public void bookAShow(String movie,String time,Patron p,String[] seats ){
		for(Show s : shows){
			if(s!=null){
				if(s.movieName.equals(movie) && s.movieTime.equals(time)){
					for(String each : seats){
						for(int i = 0; i< s.seatNumbers.length ; i++){
							if(each.equals(s.seatNumbers[i])){
								if(s.bookedSeats[i]==null){
									s.bookedSeats[i] = p;
								}
							}
						}
					}
				}
			}
		}

	}
	public void printTicket(String mobilenum,String movename,String datetime){{
		for(Show s : shows){
			for(int i =0 ;i < s.bookedSeats.length;i++){
				if(s.bookedSeats[i].mobileNum.equals(mobilenum)){
					System.out.println(s.bookedSeats[i]);
					System.out.println(s);
				}
			}
		}
	}

	// public void showAll(){
	// 	for(Show s : shows){
	// 		for()
	// 	}
	//}

	}

}