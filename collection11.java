import java.util. * ;
class collection11
{
 public static void main (String[]args)
{
	 ArrayList al = new ArrayList();
	 al.add(0);
	 al.add(1);
	 al.add(2);
	 al.add(3);
	 al.add(4);
	 al.add(3);
	 al.add(1);
	 System.out.println(al.indexOf(3));
     System.out.println(al.lastIndexOf(3));
	}
}
