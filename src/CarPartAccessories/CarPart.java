package CarPartAccessories;

public class CarPart 
{
	int min = 0;
	int max = 100;
	int condition = (int)Math.floor(Math.random()*(max-min+1)+min);
	
	public void status()
	{
		System.out.println("The status of this part: " + condition);
	}
	
	public void function()
	{
		
	}
}
