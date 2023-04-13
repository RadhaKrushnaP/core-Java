class factmethod 
{
 public static int fact (int a)
	{
	 if (a>0)
		 return a*fact (a-1);
	 }
	 else
	{
		 return 1;
	}
	public static void main()
	{
		System.out.println(fact(5));
	}
}
