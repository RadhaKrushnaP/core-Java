class car999 
{
	String brand;
	int ecc;
		car999 (String s1, int a1)
	{
		brand =s1;
		ecc= a1;
	}
	public static void main(String[] args) 
	{
		car999 c1=new car999("maruti",800);
		System.out.println(c1.brand);
		System.out.println(c1.ecc);
	}
}
