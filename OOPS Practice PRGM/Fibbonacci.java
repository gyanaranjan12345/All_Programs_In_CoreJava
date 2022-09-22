import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no of digit:");
	int n=sc.nextInt();

	int a=0,b=1,c;
     for(int i=1; i<=n; i++)
	  {
		
		 System.out.print(a+"");
		 c=a+b;
		 a=b;
		 b=c;
	  }
	}
}
