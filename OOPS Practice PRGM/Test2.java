class Car 
{
	void start()
	{
	}
	void accelerate()
	{
	}
	void stop()
	{
	}
}
class Audi extends Car
{
	void start()
	{
      System.out.println("Audi starts");
	}
	void accelerate()
	{
		System.out.println("Audi accelerate");
	}
	void stop()
	{
		System.out.println("Audi stops");
	}
}
class Benz extends Car
{
	void start()
	{
      System.out.println("Benz starts");
	}
	void accelerate()
	{
		System.out.println("Benz accelerate");
	}
	void stop()
	{
		System.out.println("Benz stops");
	}
}
class Driver
{
	void drive(Car c)
	{
		c.start();
		c.accelerate();
		c.stop();
	}
}
class Test2
{
	public static void main(String[] args) 
	{
	   Driver d1 = new Driver();
	    d1.drive(new Audi());
		d1.drive(new Benz());
	}
}
