import java.util.*;
class book implements Comparable 
{
	String name;
	int price;
	book(String name, int price)
{
		this.name=name;
		this.price=price;
}
	@Override
	public String toString()
{
	return "bookname:"+name+"price:"+price;
		@Override
		public int CompareTo(Object o)
{
		book temp=(book) o;
		if(this.price>temp.price)
{
			return 1;
}
		if(this.price<temp.price)
{
			return -1;

	public static void main(String [] args) 
	{
		book b1 = new book("java",1000);
		book b2 = new book("python",500);
		book b3 = new book("c++",900);
		book[] arr ={b1,b2,b3};
		for (int i=0;i<arr.length; i++)
		{
		System.out.println(arr[i]);
	}
}
}
