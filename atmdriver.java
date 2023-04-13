 abstract class atm1
 {
	 abstract void withdraw();
	 abstract void deposit();
 }  
 class atmdriver extends atm1
 {
	 @Override
  void withdraw()
{
System.out.println("money withdraw");
 }
	 @Override
		 void deposit()
{
		 System.out.println("money deposit");
}
	public static void main(String[] args) 
	{
		atm1 a1 = new atmdriver();
		a1.withdraw();
		a1.deposit();
	}
}
