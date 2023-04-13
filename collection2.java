import java.util.ArrayList;
class collection2
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
			al.add(10);
		    al.add(20);
			al.add(30);
			al.add(40);
			ArrayList al2=new ArrayList();
			al2.add(al);
			al2.add(1999);
			System.out.println(al2);
		System.out.println(al2.size());
		al2.addAll(al);
		System.out.println(al2);
		System.out.println(al2.size());
	}
}
