class A 
{
}
class B extends A
{
	void m2(){
		System.out.println("m2 in B");
	}
}
class Down
{
	public static void main(String[] args) 
	{
		A a1=new B();
		//a1.m2();
		B b1=(B) a1;
		b1.m2();
		((B)a1).m2();
	}
}
