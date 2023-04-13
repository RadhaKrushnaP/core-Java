import java.util.*;
class hashset1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(0);
		al.add(0);
		al.add(0);
		al.add(1);
		al.add(124);
		al.add(234);
		System.out.println(al);
		HashSet hs = new HashSet(al);
		al=new ArrayList(hs);
		System.out.println(al);
	}
}
