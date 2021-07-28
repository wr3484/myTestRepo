package CarPartAccessories;

public class Engine extends CarPart 
{
	int numOfCylinders = 6;
	int torque = 48;
	int engineDisplacement = 250;
	@Override
	public void function()
	{
		System.out.println("Number of Cylinders: " + this.numOfCylinders);
		System.out.println("Engine Torque: " + this.torque + " pound force per inch");
		System.out.println("Engine Displacement: " + this.engineDisplacement);
	}
	
	
}
