class bike99 
{
	String brand;
	int cc;
	{
		System.out.println("non static intializer executed");
	}
	bike99()
	{
		System.out.println("bike constructor executed");
	}
	public static void main (String [] args) 
	{
		System.out.println("main starts");
		bike99 b1 = new bike99();
		System.out.println("main ends");
	}
}
