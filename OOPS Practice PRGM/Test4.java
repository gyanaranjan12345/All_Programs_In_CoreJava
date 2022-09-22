abstract class B
{
	abstract void m1();
}
class C extends B
{
	void m1()
	{
		System.out.println("m1 in c");
	}

}
class D extends B
{
	void m1()
	{
		System.out.println("m1 in D");
	}
}
class Test4
{
	public static void main(String[] args) 
	{
		B b1=new C();
		b1.m1();
		 
        b1=new D();
		b1.m1();
	}
}
