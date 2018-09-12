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
									//System.out.println("BOOOKED: "+ p);
									s.bookedSeats[i] = p;
									//System.out.println("BOOkedd"+s.bookedSeats[i]);
								}
							}
						}
					}
				}
			}
		}

	}


	public void printTicket(String movename,String datetime,String mobilenum){
		//System.out.println("PTTTT");
		boolean booked = false;

		for(Show s : shows){
			if(s!=null){
				if(s.movieName.equals(movename)){
					//System.out.println("PT: "+movename);
				for(int i =0 ;i < s.bookedSeats.length;i++){
					if(s.bookedSeats[i] != null){
						//System.out.println("PT1 "+s.bookedSeats[i] +"GIVEN"+mobilenum);
						if(s.bookedSeats[i].mobileNum.equals(mobilenum)){
							booked = true;
							// System.out.print(mobilenum + " ");
							// System.out.println(s.bookedSeats[i]);
							// System.out.println(s);
						}
					}
				}}
			}
		}

		if(booked){
			System.out.println(mobilenum+" "+ movename+" " + datetime);
		}else{
			System.out.println("invalid");
		}


	// public void showAll(){
	// 	for(Show s : shows){
	// 		for()
	// 	}
	//}

	}

}