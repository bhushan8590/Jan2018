public class Dice{
	
	int rollDice(){
		return (int)(Math.random() * 6) + 1;
		}
	
	public static void main(String[] args){
		System.out.println("After Rolling dice");
		System.out.println("You get:"+new Dice().rollDice());
	}

}
