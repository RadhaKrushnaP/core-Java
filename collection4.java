import java.util.ArrayList;
class collection4
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(1000);
		System.out.println(al);
		al.remove(1000);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
	}
}
