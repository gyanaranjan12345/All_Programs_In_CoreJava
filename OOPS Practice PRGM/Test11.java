interface A
{
	void call();
} 
interface Camera
{
	void takepic();
}
class Iphone13 implements Phone,Camera
{
	public void call(){
		System.out.println("calling using iphone13");
	}
	public void takepic(){
		System.out.println("pic captured using iphone13");
	}
}
class Test11
{
	public static void main(String[] args) 
	{
		Phone p=new Iphone13();
		p.call();

		Camera c=new Iphone13();
		c.takepic();
	}
}
