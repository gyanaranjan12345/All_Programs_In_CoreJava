import java.util.Scanner;
class  Bhagia
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String st=sc.next();
 
		int i=0;
		int j=4;
		boolean k = true;

		while(i<=j)
		{
			if(st.charAt(i) !=st.charAt(j))
			{
				k=false;
				break;
			}
			i++;
			j--; 

		}
	

	
	if(k)
	{
		System.out.println("pallidrome");
	}
	else
	{
		System.out.println("not pallidrome");
	}
}}
