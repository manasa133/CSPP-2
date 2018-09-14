class Parent{
	 int x = 0;
	Parent(){
		System.out.println("I am Parent Constructor");
	}
	// private void method1(){
	// 	System.out.println("i am method1 in parent");
	// }
}
class Child extends Parent {
	Child(){
			super();
		System.out.println("I am Child Constructor"); }
	public void method1(){
		super.method1();
		System.out.println("i am method1 in Child");
	}}
class Solution{
	public static void main(String[] args) {
	Parent b1  = new Child();
	b1.method1();
	}
}
// class Child2 extends Parent{
// 	Child2(){ System.out.println("I am Child2 Constructor");}
// }
// Child2 b = new Child2();
		// //Child b2 = new Parent();
		//Parent b1 = new Child2();
		// Parent p1 =  new Parent();
		// p1.method1();
// Child b1 = new Child();
		// b1.method1();
// public void childMethod(){
// 		System.out.println("i am childMethod in parent");

// 	}