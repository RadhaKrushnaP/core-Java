class insta1 
{
void post()
	{
	System.out.println("image");
	}
}
   class instav2 extends insta1
 {
    @Override
	void post()
	{
	super.post();
		System.out.println("video");
	}
	void dm()
	{
		System.out.println("text");
	}
}
class instav3 extends instav2
{
	@Override
		void post()
	{
		super.post();
		System.out.println("text");
	}
	@Override
		void dm()
	{
		super.dm();
		System.out.println("image");
	}
	void reel()
	{
		System.out.println("30 sec video");
	}
}
class instagram extends instav3
{
	public static void main (String[]args) 
{
		System.out.println("====instagram====");
		instagram in = new instagram();
		System.out.println("====insta post====");
		in.post();
		System.out.println("====insta dm====");
		in.dm();
		System.out.println("====insta reels====");
		in.reel();
}
}
