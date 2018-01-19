import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	void insertElement(int array[] ,int position, int element){
		boolean positionFlag=false;
		int tempArray[] = new int[array.length +1];
		for(int i=0;i<tempArray.length;i++){
			if(i == position){
				tempArray[i]=element;
				positionFlag = true;
			}
			else if(positionFlag){
				tempArray[i]=array[i-1];
			}
			else{
				tempArray[i]=array[i];
			}
		}
		System.out.println(Arrays.toString(tempArray));
	}
	
	private void removeElement(int array[], int element1) {
		boolean positionFlag=false;
		int tempArray[] = new int[array.length-1];
		for(int i=0;i<tempArray.length;i++){
			if(array[i] == element1){
				tempArray[i]=array[i+1];
				positionFlag = true;
			}
			else if(positionFlag){
				tempArray[i]=array[i+1];
			}
			else{
				tempArray[i]=array[i];
			}
		}
		System.out.println(Arrays.toString(tempArray));
	}
	
	private void removeString(String strArray[], String str) {
		boolean positionFlag=false;
		String tempArray[] = new String[strArray.length-1];
		for(int i=0;i<tempArray.length;i++){
			if(strArray[i] == str){
				tempArray[i]=strArray[i+1];
				positionFlag = true;
			}
			else if(positionFlag){
				tempArray[i]=strArray[i+1];
			}
			else{
				tempArray[i]=strArray[i];
			}
		}
		System.out.println(Arrays.toString(tempArray));
	}

	public static void main(String[] args) {
		
		int array[]={10,40,50,60};
		int position=0,element=80,element1=40;
		String strArray[] = {"one","two","three","four"};
		String str="three";
		ArrayDemo ad = new ArrayDemo();
		System.out.println("Original Array:"+Arrays.toString(array));
		System.out.println("Insert Element:"+element+" at position:"+position);
		ad.insertElement(array, position, element);
		System.out.println("Remove Element:"+element1);
		ad.removeElement(array, element1);
		System.out.println("String Array:"+Arrays.toString(strArray));
		System.out.println("Remove String:"+str);
		ad.removeString(strArray, str);
	}

}
