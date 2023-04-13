class animal2
{
	String type;
	int nooflegs;
	double age;
	animal2(int nooflegs)
	{
		this.nooflegs= nooflegs
	}
		animal2(String type)
	{
		this.type=type
	}
	animal2(String type, int nooflegs, double age);
}
	this.type=type;
	this.nooflegs=nooflegs;
	this.age=age;
	}
	void display()
	{
		System.out.println("\n====details of animal====");
		System.out.println("type:" +type);
		System.out.println("nooflegs": +nooflegs);
		System.out.println("average age:" +age);
	}
	public static void main(String[] args) 
	{
		animal2 lion = new animal2("carnivore");
		lion.display();
		animal2 bear = new animal2("omnivore",4,30);
		bear.display();
	}
}
