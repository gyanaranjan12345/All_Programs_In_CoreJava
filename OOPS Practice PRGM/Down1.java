class A 
{
}
class B extends A
{
	void m2(){
		System.out.println("m2 in B");
	}
}
class C extends A
{
	void m3(){
		System.out.println("m3 in c");
	}
}
class Down1
{
	public static void main(String[] args) 
	{
		A a1=new B();
		C c1=(C)a1;
	}
}