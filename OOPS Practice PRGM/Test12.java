interface I1
{
	void m1();
	default void m2(){
		System.out.println("m2 impl in I1");
	}
}
class C implements I1
{
	public void m1(){
		System.out.println("m1 impl in C");
	}
}
class Test12
{
	public static void main(String[] args) 
	{
		I1 ref=new C();
		ref.m1();
		ref.m2();
	}
}
