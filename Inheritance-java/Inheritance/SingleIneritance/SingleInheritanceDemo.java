class Vehicle
{
	void start()
	{
		System.out.println("vehicle start");
	}
}
class Car extends Vehicle
{
	// @Override
	void start()
	{
		//super.start();
		System.out.println("car start");
	}
}
public class SingleInheritanceDemo
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.start();
	}
}

