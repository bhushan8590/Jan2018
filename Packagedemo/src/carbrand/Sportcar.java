package carbrand;
import carpack.*;

public class Sportcar extends Car {

	public Sportcar(String make, String year) {
		super(make, year);
	}
	
	public void drive(){
		System.out.println("Driving sport car");
	}
	public static void main(String args[]) {
		Sportcar sc = new Sportcar(args[0], args[1]);
		sc.drive();
		System.out.println("Make:"+sc.getMake());
		System.out.println("Year:"+sc.getYear());
	}
}