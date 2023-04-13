class fruit 
{
	void taste()
	{
		System.out.println("taste of fruit");
	}
}
class apple extends fruit
{
	@Override
		void taste()
	{
		super.taste();
		System.out.println("taste of apple");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		apple.a1 = new apple();
		a1.taste();
		System.out.println("main ends");
	}
}
