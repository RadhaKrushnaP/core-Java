import java.util.*;
class collection10 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		try
		{
			System.out.println(i.next());
		}
		catch (NoSuchElementException e)
		{
			System.out.println("no element available");
		}
	}
	}
