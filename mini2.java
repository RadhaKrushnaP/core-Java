class mini2 
{
	public static void add (int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.pritln(a-b);
	}
	public static  void mul(int a,int b);
	{
		System.out.println(a*b);
	}
	public static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void mod(int a,int b)
	{
		System.out.println(a%b);
	}
	public static void main (String[]args)
	{
		char ch;
		switch(ch)
		{
			case'+': add(10,5); break;
			case'-': add(10,5); break;
			case'*': add(12,5); break;
			case'/': add(12,8); break;
			case'%': add(3,2); break;
			{
			default System.out.println("calculator");
		}
	}
}
