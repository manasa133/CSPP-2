class AgeException extends Exception{
	AgeException(String mess){
		super(mess);
		//System.out.println(mess);

	}
}

class exceptio1 {
	public static void main(String[] args) {
		int age =8;
		try{
			if(age < 18){
			throw new AgeException("my own exception");
		}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("out side");
	}

}