class Bike
{
	void start()
	{
		System.out.println("started");
	}
	static int cc=200;
	String brand;
	String color;
	double price;
	public static void main(String[] args) 
	{
		System.out.println("ms");
		Bike B1= new Bike();
		B1.brand="yamaha";
		System.out.println(B1.brand);
		System.out.println(cc);
		int cc=250;
		cc=300;
		System.out.println("me");
	}
}
