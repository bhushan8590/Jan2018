package TestPackage;
import java.util.Scanner;

import packageDemo1.*;

public class TestSampleClass extends Sample {

	public static void main(String[] args) {
		Sample sa = new Sample();
		Scanner sc = new Scanner(System.in);
		String option;
		boolean flag = true;
		do {
			System.out.println();
			System.out.println("one -->call public method");
			System.out.println("two -->call protected method");
			System.out.println("three -->call default method");
			System.out.println("four -->call private method");
			System.out.println("five -->Quit");
			System.out.print("Type your option:");
			option = sc.nextLine();
			
			switch (option) {
			case "one":sa.printvarinfo();	
					   break;
			case "two":new TestSampleClass().protectedMethod();	
			   		   break;
			case "three"://sa.defaultMethod();
						System.out.println("Can't call default method outside of package");
			   		   break;
			case "four"://sa.privateMethod();
						System.out.println("Can't call private method outside of class");
			   			break;
			case "five": flag = false;
						break;
			}
		} while (flag);
		System.out.println("Thank You..!!");
	}

}
