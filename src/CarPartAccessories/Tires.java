package CarPartAccessories;

public class Tires extends CarPart
{
	int tirePressure = 35;
	
	@Override
	public void function()
	{
		System.out.println("Status of all tire pressure: " + tirePressure + " psi");
	}
	
	
}
