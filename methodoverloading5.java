class methodoverloading5 
{
	void display()
	{
		System.out.println("hello");
	}
	void display(int a)
	{
		System.out.println("hello" ,int);
	}
	public static void main(String[] args) 
	{
		methodoverloading1 01 = new methodoverloading();
		01.display(5);
	}
}
