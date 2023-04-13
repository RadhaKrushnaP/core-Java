class methodoverloading2 
{
	public static void display(int a)
	{
		System.out.println("hello");
	}
	public static void display(String a)
	{
		System.out.println("hello2");
	}
	public static void main(String[] args) 
	{
		display("hello");
	}
}
