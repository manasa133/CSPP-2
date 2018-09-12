class Patron{
	String name;
	String mobileNum;
	Patron(String name, String mob){
		this.name = name;
		this.mobileNum = mob;
	}

	public String toString(){
		return name+" "+mobileNum;
	}

}