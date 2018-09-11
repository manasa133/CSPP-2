import java.util.*;
class Sortedset extends Set{
	int[] arr;
	Sortedset(){

	}
	Sortedset(int[] param){
		for(int i : param){
			add(i);
		}
	}
	public void add(int item){
		if( size()==0 ){
			arr[size()] =item;
			setSize(size()+1);

		}
		int index;
		for(index = 0; index <size() ; index++){
			if(arr[index]> item){
				break;
			}
		}
		for(int i = size() ; i> index ; i--){
				arr[i] = arr[i-1];
		}
		arr[index] = item;
		setSize(size()+1);
	}

	int[] subset(int from,int to){
		int start = 0;
		for(int i =0 ;i< size();i++){
			if(arr[i]==from){
				start = i;
				break;
			}

		}
		int stop=0;
		for(int i =0 ;i< size();i++){
			if(arr[i]==to){
				stop = i;
				break;
			}

		}
		int[] newArr = new int[stop-start];
		for(int i = start,j=0 ;i<stop;i++, j++){
			newArr[j] = arr[i];
		}
		return  newArr;
	}

	int[] headSet(int to){
		return subset(arr[0],to);

	}
	 int last(){
	 	try{
	 	if(size()==0){
	 		throw new ArithmeticException("Set​ ​ Empty​ ​ Exception");
	 	}
	 }catch(Exception e){
	 	System.out.println("Set​ ​ Empty​ ​ Exception");
	 }
	 	return arr[size()-1];
	 }

	 void addAll(int[] a){
	 	for(int i : a){
	 		add(i);
	 	}
	 }


}
class Solution{
	public static void main(String[] args) {
		Sortedset obj = new Sortedset();
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines>0){
			String[] value = sc.nextLine().split(" ");//addAll -1,-2,3,-7,-9,6,9
			switch(value[0]){
				case "addAll":
				String[] vals =  value[1].split(",");
				int[] ints =  new int[vals.length];
				for(int i =0;i< vals.length;i++){
					ints[i] =Integer.parseInt(vals[i]);
				}
				obj.addAll(ints);

				break;
				case "subSet":
				String[] val1s =  value[1].split(",");
				int[] int1s =  new int[val1s.length];
				for(int i =0;i< val1s.length;i++){
					int1s[i] =Integer.parseInt(val1s[i]);
				}
				obj.subset(int1s[0],int1s[1]);

				break;
				case "last":
				obj.last();
				break;
				case "headSet":
				obj.headSet(Integer.parseInt(value[1]));
				break;
				case "print":
				System.out.println(obj);
				break;
			}

			lines--;
		}
	}
}