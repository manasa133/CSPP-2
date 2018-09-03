// package com.example;
// class clssdemo p Parent implements Interface {
	
// }
class Student{
	private String name;
	private int rollNum;

	public Student(){
		this.name ="hello";
		this.rollNum = 123;
	}

	// public Student(String name1,int rollnum1){
	// 	// this.name =name;
	// 	// this.rollNum = rollnum;
	// 	this.name =  name1;
	// 	this.rollNum = rollnum1;
	// }

	static  void hello(){
		System.out.println("hello");

	}

	public static void main(String[] ar){
		// Student obj = new Student();
		// // obj.name = "monday";
		// // System.out.println(obj.name);
		// //Student obj1 = new Student("monday",1);
		// //System.out.println(obj1.name);
		// // college obj1 = new college();
		// // // obj1.callingPrivate();
		// // obj1.callPrivate();
		//  college obj1 = new college();
		//  obj1.setCollegeName("two");
		//  System.out.println( obj1.getCollegeName());
		// Student obj = new Student();
		// obj.hello();
		// college obj1 = new college();
		//  obj1.setCollegeName("two");
		System.out.println(new college().collegeName); 
	}
}


class college{
	String collegeName;
	college(){
		collegeName ="one";
	}

	String getCollegeName(){
		return this.collegeName;
	}

	void setCollegeName(String name){
		this.collegeName = name;
	}


	// void hello(){
	// 	System.out.println("hello");
	// }
	// void callPrivate(){
	// 	callingPrivate();
	// }
	// private void callingPrivate(){
	// 	System.out.println( "callingPrivate ");
	// }


}