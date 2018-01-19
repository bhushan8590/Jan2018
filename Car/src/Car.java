import java.util.Scanner;

public class Car {
	
	//Variable
	boolean carState=false;
	int carSpeed=0,miles=100,fuel=100;
	
	//Behaviour
	void print(){
		if(this.carState)
			System.out.println("Car Current State is START");
		else
			System.out.println("Car Current State is STOP");
		
		System.out.println("Car current speed:"+carSpeed);
		System.out.println("Car miles:"+miles);
		System.out.println("Fuel level:"+fuel);
	}
	
	void start(){
		if(this.carState==false){
			System.out.println("Car Started..!!!");
			this.carState = true;
		}
		else if(this.carState)
			System.out.println("Car already started..");	
	}
	
	void drive(){
		this.carSpeed += 40;
		this.miles += 20;
		this.fuel -= 10;
	}
	
	void applybreak(){
		this.carSpeed -= 5;
	}
	
	void accelerate(){
		this.carSpeed += 10;
	}
	
	void stop(){
		this.carSpeed = 0;
		this.carState = false;
	}
	
	public static void main(String[] args){
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Start Car");
			System.out.println("2.Drive Car");
			System.out.println("3.Stop Car");
			System.out.println("4.Print Car current info");
			System.out.println("5.Quit");
			System.out.println("Enter choice(1-5):");
			choice = sc.nextInt();
			switch (choice) {
			case 1: car.start();
					break;
			case 2: car.drive();
					break;
			case 3: car.stop();
					break;
			case 4: car.print();
					break;

			}
		} while (choice != 5);
		System.out.println("Thank You..!!");
	}
		
}
