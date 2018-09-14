interface A {
	void method1();
}
interface b extends A {
	void method2();
}
class two  implements b{
	public static void main(String[] args) {
		two t  = new two();

		t.method2();

	}
	public void method2(){
		System.out.println("method2");
	}
	public void method1(){
		System.out.println("method1");
	}
}


// // }
// class grandparent{
// 	protected grandparent(){
// 		System.out.println("grandparent");
// 	}
// 	// void show(){
// 	// 	System.out.println("gp");
// 	// }
// }
// class parent extends grandparent{
// 	parent(){
// 		System.out.println("parent");
// 	}
// 	// void show(){
// 	// 	System.out.println("parent");
// 	// }
// }
// class child extends parent{

// 	child(){

// 		System.out.println("child");
// 	}
// 	void show(){
// 		System.out.println("child");
// 	}
// }
//  class Solution{
// 	public static void main(String[] args) {
// grandparent p =new child();
// //p.show();
// 		//parent q = new grandparent();
// 	}
// }

// final class base{
// 	int x =10;
// 	base(){
// 		x=100;
// 		System.out.println(x);
// 	}

// }
// class derived extends base{
// 	derived(){
// 		System.out.println(x);
// 	}

// }
// class Solution{
// 	public static void main(String[] args) {
// 		base c= new base();
// 		derived b = new derived();
// 	}
// }


// // interface A {
// // 	public void show();
// // }
// // interface C{
// // 	public void show();
// }
// interface B extends A,C{
//  public void print();
// }

// class sub implements B{
// 	public void print(){
// 	}
// 	public void show(){

// 	}
// }


// class Solution{
// 	public static void main(String[] args) {
// 		sub b = new sub();;

// 	}
// }
class Parent{
	int x;
	Parent(){
		x=10;
	}
}
class Child extends Parent{
	int x =20;
	Child(){
		System.out.println(super.x);
		System.out.println(x);
	}
}
class t {
	public static void main(String[] args) {
		Child c = new Child();
	}
}