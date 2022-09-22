class A 
{
	static{
		  System.out.println("static block of A");
	      }
	      {
		  System.out.println("non-static block of A");
	      }
	A(){
		System.out.println("constructor of A");
	   }
}
class B extends A
{
	static{
		   System.out.println("static block of B");
	      }
	      {
		   System.out.println("non-static block of B");
		  }
    B(){
		System.out.println("constructor of B");
	   }
}
class Test7
{
   public static void main(String[] args) 
	{
		new B();
	}
}
