interface vehicle
{
	void honk();
	void stop();
}
interface car extends vehicle
{
	void start();
}
class nano implements car
{
	@Override
		public void start()
{
		System.out.println("nano start");
} 
   @Override
	   public void stop()
{
	   System.out.println("nano stop");
}
   @Override
	   public void honk()
{
	   System.out.println("penn penn");
}
}
class cardriver
{
	public static void main(String[] args) 
{
		nano n1 = new nano();
		n1.start();
		n1.honk();
		n1.stop();
	}
}
