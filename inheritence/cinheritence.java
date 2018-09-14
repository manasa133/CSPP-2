class Parent{
	//int  x = 5;
	// Parent(){
	// 	System.out.println("Parent");
	// 	//x++;
	// }
	void display(){
		System.out.println("i am Parent");
	}
}
class Child extends Parent{
	//  Child(){
	//  	System.out.println("Child");
	// // 	x++;
	// }
	void display(){

		//super.display();
		System.out.println("i am Child");
	}
}

class Solution{
	public static void main(String[] args) {
		//Child b = new Child();
		//b.display();
		Parent p = new Child();
		p.display();

		//Child b1 = new Parent();
		//System.out.println( b.x );

		// Child b = new Child();
		// System.out.println( b.x );
		// Child b = new Child();
		// System.out.println( b.x );
	}
}