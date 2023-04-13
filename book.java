class book 
{
	String name;
	int noofpages;
	book(String name, int noofpages)
	{
		this.name=name;
		this.noofpages= noofpages;
	}
	@Override
		public boolean equals (Object o)
	{
		book temp =(book)o;
		if(this.name==temp.name && this.noofpages==temp.noofpages)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		book b1 = new book("java",1000);
		book b2 = new book("java",999);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}
}
