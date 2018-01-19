
public class Secondleast {
	
	int secondLeast(int array[]){
		int i,j,k;
		for(i=0;i<=array.length-1; i++){
			for(j=i+1;j<=array.length-1;j++){
			if(array[i]>array[j]){
				k=array[i];
				array[i]=array[j];
				array[j]=k;
			}
		  }
		}
		return array[1];
	}

	public static void main(String[] args) {
		int[] arr = {8,9,5,7,6,3};
		System.out.println("Second Least number:"+new Secondleast().secondLeast(arr));
	}

}
