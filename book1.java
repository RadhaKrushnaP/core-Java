class book1 
{
	String name;
	book1 (String name)
	{
		this.name=name;
	}
    }
	public static void main(String[] args) 
	{
		book1 b1 = new book1 ("java");
		book1 b2 = new book1("java");
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

