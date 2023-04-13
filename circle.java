class Shape 
{
	int area;
}
class circle extends Shape
{
	int radius;
	public static void main(String[] args) 
	{
		circle c=new circle();
		Shape s=c;
		System.out.println(s==c);
		System.out.println("c=radius");
		System.out.println("c=area");
		System.out.println("s.area");
	}
}
