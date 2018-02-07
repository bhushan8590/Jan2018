package calculator;

import javax.print.attribute.standard.RequestingUserName;

public class CalculatorFunction {
		
		int add(int a, int b){
			return a + b;
		}
		
		int sub(int a, int b){
			return a - b;
		}
		
		int mul(int a, int b){
			return a * b;
		}
		
		int div(int a, int b){
			return a / b;
		}
		
		int fact(int a){
			
			int fact=0;
			if(a == 0){
				return 1;
			}
			else{
				fact = a * fact(a-1); 
				return fact;
			}
		}
}
