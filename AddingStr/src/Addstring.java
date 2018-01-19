public class Addstring {
	
	int convertStrToAscii(String str){
		int sum=0,placevalue=1;
		for(int i=str.length()-1; i>=0 ; i--){
			sum += ((int)str.charAt(i) - 48)*placevalue;
			placevalue *= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		 Addstring as = new Addstring();
		String a="1234",b="4321";
		int result = as.convertStrToAscii(a)+as.convertStrToAscii(b);
		System.out.println(""+result+"");
	}

}
