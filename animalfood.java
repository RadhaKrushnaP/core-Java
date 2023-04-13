class animal1 
{
	void eat()
	{
		System.out.println("all animal eat");
	}
}
	class herbiovers extends animal1
	{
		@Override
			void eat()
	{
			System.out.println("they eat plant only");
	}
	}
	class carniovers extends animal1
	{
		@Override
			void eat()
		{
			System.out.println("they eat flesh only");
		}
	}
	class omnivores extends animal1
	{
		@Override
			void eat()
		{
			System.out.println("they eat both plant and flesh");
		}
	}
	class animalfood
	{
	public static void main(String [] args) 
	{
		herbiovers cow = new herbiovers();
		cow.eat();
		carniovers lion = new carniovers();
		lion.eat();
	}
}
