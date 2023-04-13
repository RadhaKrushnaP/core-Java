class book3 
{
	String name;
	int noofpages;
	book3(String name, int noofpages)
	{
		this.name=name;
		this.noofpages=noofpages;
	}
	@Override
		public boolean equals(Object o)
	{
		book3 temp=(book3)o;
		if (this.name==temp.name && this.noofpages==temp.noofpages)
	{
	  return true;
	}
	  return false;
	}
    }
	@Override
	public int hashcode()
	{
		return((integer)noofpages).hashcode()+name.hashcode();
	}
	public static void main(String[] args) 
	{
		book3 b1 = new book3("java",1000);
		book3 b2 = new book3("java",1000);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashcode());
		System.out.println(b2.hashcode());
	}
}
