package CarPartAccessories;

public class Car 
{
	public void run()
	{
		System.out.println("Checking Tires: ");
		Tires myTires = new Tires();
		myTires.status();
		myTires.function();
		System.out.println('\n');
		System.out.println("Checking Engine: ");
		Engine myEngine = new Engine(); 
		myEngine.status(); 
		myEngine.function();
		System.out.println('\n');
		System.out.println("Checking Gas Tank: ");
		GasTank myTank = new GasTank(); 
		myTank.status(); 
		myTank.function();
		
	}
	
	
}
