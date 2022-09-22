interface I
{
	void m1();
}
class A implements I
{
	public void m1(){
		System.out.println("m1 in A");
	}
}
class B implements I
{
	public void m1(){
		System.out.println("m1 in B");
	}
}
class Test9s
{
	public static void main(String[] args) 
	{
		I ref;
		ref=new A();
		ref.m1();
	}
}
