import java.util.*;
class sample2{
	 String rollnum;
	// int[] arr;

	// sample1(){
	// 	arr = new int[5];

	// }
	// void add(int[] ar1){
	//  	arr = ar1;
	//  }

}
class sample1{
	 int rollnum;
	// int[] arr;

	// sample1(){
	// 	arr = new int[5];

	// }
	// void add(int[] ar1){
	//  	arr = ar1;
	//  }

}

class sample3<E>{
	E rollnum;

}
public class sample{
	public static void main(String[] args) {
		sample1 obj = new sample1();
		sample3<Integer> obj1 = new sample3();
		System.out.println((obj1.rollnum=3)==3);
		sample3<String> obj2 = new sample3();
		System.out.println(obj2.rollnum="abc");
		sample3<Student> obj2 = new sample3();
		System.out.println(obj2.rollnum="900abc");
		// obj.add([1,2,3,4,5]);
		// System.out.println(Arrays.toString(obj.arr) );

		// // int arr[] = {1,2,3,4};
		// // System.out.println(arr);
		// // for (int i : arr){
		// // 	i;
		// // }
	}

}