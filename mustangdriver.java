abstract class vehicle
{
	abstract void start();
	abstract void stop();
}  
abstract class car extends vehicle
{
	abstract void shiftgears();
}
class mustang extends car
{
	@Override
		public void start()
{
		System.out.println("mustang start");
}
@Override
	public void stop()
{
	System.out.println("mustang stopped");
}
@Override
	public void shiftgears()
{
	System.out.println("shiftgears");
}
}
class mustangdriver
{
	public static void main(String[] args) 
{
	mustang m1 = new mustang();
	m1.start();
	m1.shiftgears();
	m1.stop();
	}
}
