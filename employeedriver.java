interface qspiders 
{
	void testing();
}
    interface jspiders
{
    void developing();   
}
class testyantra
{
	void work()
{
    System.out.println("employee working");
}
}
class employee extends testyantra implements qspiders, jspiders
{
	@Override
		public void testing()
{
	System.out.println("employee testing the software");
}
   @Override
	   public void developing()
{
	   System.out.println("employee developing the software");
}
}
class employeedriver
{
	public static void main(String[] args) 
{
		employee e1 = new employee();
		e1.testing();
		e1.developing();
		e1.work();
	}
}
