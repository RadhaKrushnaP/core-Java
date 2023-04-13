class father 
{
	String property="10cr";
}
class child1 extends father
{
String prop1= "1honda";
}
class child2 extends father
{
	String prop2="1ferrari";
}
	class child3 extends father
	{
		String prop3="ktm duke";
	}
	class testchild
	{
		public static void main (String[] args)
		{
		child c2 = new child2();
		System.out.println(c2.prop2);
			System.out.println(c2.property);
	}
}
