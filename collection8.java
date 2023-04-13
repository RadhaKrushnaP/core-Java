import java.util.ArrayList;
class collection8
{
	public static void main(String[] args) 
{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("hello");
		al.add('c');
		al.add(210.223);
		al.add(100);
		al.add(100);
		for(Object el:al)
{
		System.out.println(el);
	}
}
}