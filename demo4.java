class demo4
{
	public static void main(String[] args) 
	{
    String str="hello";
	String str2=" ";
	for(int i=str.length()-1 ; i>=0 ; i--)
		{
		str2 += strcharAT(i);
		}
		System.out.println(str);
		System.out.println(str2);
	}
}
