import  java.util.*;
class Set{
	int[] setArray;
	int size;

	Set(){
		setArray = new int[10];
		size=0;
	}

int size(){
	return size;
}
boolean contains(int item){
	return true;


}
public String toString(){
	return null;

}
void add(int item){
	if (size == setArray.length){
		resize();
	}
	setArray[size++] = item;

}
void resize(){
	setArray = Arrays.copyOf(setArray,2*size);
}
void add(int[] items){
	for(int item : items){
		add(item);
	}

}
Set intersection(Set other){
	return null;

}
Set retainAll(int[] other){
	return null;

}
int[][] cartesianProduct(Set other){
	return null;

}

}