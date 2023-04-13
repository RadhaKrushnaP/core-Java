import java.util.*;
class collection12 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		al.add(1);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
