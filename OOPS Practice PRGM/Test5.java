abstract class Car 
{
	abstract void start();
	abstract void accelerate();
	abstract void stop();
}
class Audi extends Car
{
	void start()
	{
	System.out.println("audi starts");
	}
	void accelerate()
	{
	System.out.println("audi accelerate");
	}
	void stop()
	{
	System.out.println("audi stop");
	}

}
class Benz extends Car
{
	void start()
	{
	System.out.println("benz starts");
	}
	void accelerate()
	{
	System.out.println("benz accelerate");
	}
	void stop()
	{
	System.out.println("benz stop");
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
class Test5
{
	public static void main(String[] args) 
	{
		Driver d=new Driver();
		d.drive(new Audi());
		d.drive(new Benz());
	}
}
