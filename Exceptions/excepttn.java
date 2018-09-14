class Solution {
	public static void main(String[] args) {
		try{

		//int a  = 1/0;
			int[] a = new int[10];
			System.out.println(a[a.length]);
			throw new ArrayIndexOutOfBoundsException("I am the message");
		}
		catch (Exception e){
			System.out.println(e);
		}

		// catch (ArithmeticException e){
		// 	System.out.println(e);
		// 	System.out.println("ArithmeticException");
		// }
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			//System.out.println("Array index out of bounds");
		}

		System.out.println("I am out of trycatch");
	}
}
// try{

// 		//int a  = 1/0;
// 			int[] a = new int[10];
// 			System.out.println(a[a.length]);
// 		}
// 		catch (ArithmeticException e){
// 			System.out.println("zero division error");
// 		}catch (Exception e){
// 			System.out.println(e);
// 			System.out.println("final catch");
// 		}