package carpack;

public class Car {
	
	String make;
	String year;
	
	public Car(String make, String year) {
		super();
		this.make = make;
		this.year = year;
		//System.out.println("Make:"+this.make);
		//System.out.println("Year:"+this.year);
	}

	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	protected void drive(){
		System.out.println("Driving car...!!");
	}
}
