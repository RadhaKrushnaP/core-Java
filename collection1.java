import java.util. ArrayList;
class collection1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		ArrayList al2=new ArrayList(al);
		al2.add(100);
		System.out.println(al2);
	}
}
