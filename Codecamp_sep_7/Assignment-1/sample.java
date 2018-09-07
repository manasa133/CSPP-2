class Student {
	int rollnum;
	String name;
	Student(int num, String na){
		rollnum = num;
		name = na;
	}
	public boolean equals(Student obj){
		if(this.rollnum!=obj.rollnum) {
			return  false;
		}
		if(this.name!=obj.name) {
			return  false;
		}
		return true;
	}
	public String toString(){
		return name+rollnum;
	}
}
class sample {
	public static void main(String[] args) {
		Student obj1 = new Student(123,"abc");
		System.out.println(obj1);
		// Student obj2 = new Student(123,"abc");
		// Student obj3 = new Student(123,"abc2");
		// System.out.println(obj1.equals(obj2));
		// System.out.println(obj1.equals(obj3));

	}
}