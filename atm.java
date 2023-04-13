interface bank
{
	int balance=1000;
	void withdraw();
	void deposit();
} 
class atm implements bank
{
	@Override
		public void withdraw()
{
		System.out.println("money withdraw");
}
    @Override
		public void deposit()
{
		System.out.println("money deposit");
}
	public static void main(String[] args) 
{
		atm a1 = new atm();
		a1.withdraw();
		a1.deposit();
		System.out.println("1000");
	}
}
