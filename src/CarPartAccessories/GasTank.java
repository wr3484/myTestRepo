package CarPartAccessories;

public class GasTank extends CarPart 
{
	int maxSize = 20;
	int totalGallonsLeft = 10;
	
	@Override
	public void function()
	{
		System.out.println("Size of Gas Tank Volume: " + this.maxSize + " Gallons");
		System.out.println("Total Amount of Gas Left: " + this.totalGallonsLeft + " Gallons");
	}
}
