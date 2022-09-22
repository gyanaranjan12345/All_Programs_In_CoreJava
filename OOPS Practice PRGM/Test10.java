class Box 
{
	int height;
	int length;
	int width;
	Box(){
	}

	Box( int h,int l, int w){
		height=h;
		length=l;
		width=w;
	}
	Box(int n){
		height=n;
		length=n;
		width=n;
	}
	void display(){
		System.out.println("["+height+","+length+","+width+"]");
	}
}
class Test10
{
	public static void main(String[] args) 
	{
		Box b1=new Box(5,6,7);
		b1.display();

        Box b2=new Box();
		b2.display();

        Box b3=new Box(4);
		b3.display();

	}
}
