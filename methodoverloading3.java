class methodoverloading3 
{
	public static void display(int a, String s)
	{
		System.out.println("hello");
	}
	public static void dispaly(String a, int b)
	{
		System.out.println("hello2");
	}
	public static void main(String[] args) 
	{
		dispaly("hello",10);
	}
}
