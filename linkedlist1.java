import java.util.*;
class linkedlist1
{
	public static void main(String[] args) 
	{
		LinkedList <String> l1=new LinkedList <String>();
		l1.add("sonu");
		l1.add("monu");
		l1.add("lala");
		l1.add("k");
		Iterator i = l1.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next() + " ");
	}
  }
}