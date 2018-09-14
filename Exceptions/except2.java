class AgeException extends Exception{
	AgeException(String mess){
		System.out.println(mess);

	}
}
class except2 {
	void method1() throws ArithmeticException{
		int [] a =new int[10];
		int b = a[12];
	}

	public static void main(String[] args) {
		try{
		new except2().method1();
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("i am finally block");
		}


	}


}