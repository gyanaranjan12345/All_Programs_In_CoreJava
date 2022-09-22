import java.util.Scanner;
class  Hagara
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=sc.nextLine();

		String temp="";
		for(int i=0; i<st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}else{
				ch=(char)(ch+32);
			}
			temp=temp+ch;
		}
		System.out.println(temp); 
	}
}
