import java.util.Scanner;
class Dilip
{
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter a string:");
		String st=t.next();
		System.out.println("enter a character:");
		int count=0;
		char ch=t.next().charAt(0);
		for(int i=0; i<st.length(); i++)
		{
			char ch1=st.charAt(i);
			if(ch==ch1)
			{
				count++;
	
	      }
		}
		System.out.println(ch+"--"+count);
	}
}
