class Human 
{
	public void display()
	{
		System.out.println("Every human is not a student");
	}
}

class Student extends Human
{
	public void display()
	{
		System.out.println("Every student is ahuman");
	}
}

class Poly
{
	public static void main(String[] args) 
	{
		Human object= new Human();
		Human obj=new Student();

		object.display();
		obj.display();

	}
}
