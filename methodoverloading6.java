class methodoverloading6 
{
	public static int ab(int a, int b)
	{
		return a+b;
	}
  public static int bc(int a, int b, int c)
	{
		return a+b+c;
	}
  public static double add (double a, double b)
	{
		return a+b;
	}
  public static double add1 (double a, double b, double c, double d)
	{
		return a+b+c+d;
	}
  public static void main (String[]args)
	{
			System.out.println(ab(21,33));
			System.out.println(bc(12,55,35));
			System.out.println(add(35.2,55.1));
			System.out.println(add1(21.21,323.1,122.1,25.5));
	}
}
