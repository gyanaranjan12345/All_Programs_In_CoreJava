import java.util.Scanner;
class Nallu
{
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter a string:");
		String st=t.nextLine();
		System.out.println("enter a character:");
		char ch=t.next().charAt(0);
		int count=st.length()-st.replace(ch+"","").length();
		
		System.out.println(ch+"occur"+count+"times");
	}
}
