class logical1 
{
	public static void main(String[] args) 
	{
		int a= 10;
		int b= 5;
		boolean res = a++ +>b && b++ > a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(res);
	}
}
