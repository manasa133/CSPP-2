class Show {
	String movieName;
	String movieTime;
	String[] seatNumbers;
	Patron[] bookedSeats;

	Show(String movie,String date, String[] seats){
		movieName = movie;
		movieTime = date;
		seatNumbers = seats;
		bookedSeats = new Patron[seats.length];
	}

	 public String toString() {
    String s = "";
    s = s + movieName + ",";
    s = s + movieTime;
    // s = s + "{";
    // for (int i = 0; i < seatNumbers.length; i++) {
    //   s = s + seatNumbers[i];
    //   if (i != seatNumbers.length - 1)
    //     s = s + ",";
    // }
    // s = s + "}";
    return s;
  }

  public String toString(Show s1) {
    String s = "";
    s = s + movieName + ",";
    s = s + movieTime;
    // s = s + "{";
    // for (int i = 0; i < seatNumbers.length; i++) {
    //   s = s + seatNumbers[i];
    //   if (i != seatNumbers.length - 1)
    //     s = s + ",";
    // }
    // s = s + "}";
    return s;
  }

}