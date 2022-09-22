class P 
{
	static void m1()
		{
		System.out.println("static m1 in P");
	    }
}
class Q extends P
{
	static void m1()
		{
		System.out.println("static m1 in Q");
	    }
}
class TestP
{
	public static void main(String[] args) 
	{
		P p1=new Q();
		p1.m1();
	}
}
