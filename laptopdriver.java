import java.util.*;
class laptop 
{
	String brand;
	int ram;
	int ssd;
	double price;
	laptop(String brand , int ram , int ssd , double price)
	{
		this.brand=brand;
		this.ram=ram;
		this.ssd=ssd;
		this.price=price;
	}
	@Override
		public String toString()
	{
		return "name:" +brand+"ram:" +ram+"ssd:"+ssd+"price:" +price;
	}
    }
     class ramComparator implements Comparator
    {
	@Override
	public int compare(Object o1,Object o2)
	{
		laptop l1 = (laptop)o1;
		laptop l2 = (laptop)o2;
		if(l1.ram>l2.ram)
	{
			return 1;
	}
		if(l1.ram<l2.ram)
	{
			return -1;
	}
		return 0;
	}
	}
	  class priceComparator implements Comparator
	{
		@Override
		public int compare (Object o1,Object o2)
	{
			laptop l1 = (laptop)o1;
			laptop l2 = (laptop)o2;
			if(l1.price>l2.price)
	{
				return 1;
	}
			if(l1.price<l2.price)
	{
			return -1;
	}
			return 0;
    }
	}
		class laptopdriver
	{
	public static void main(String[] args) 
	{
		laptop l1 = new laptop("hp",8,512,500000);
		laptop l2 = new laptop("lenevo",10,1000,600000);
		laptop l3 = new laptop("apple",11,800,100000);
		laptop [] arr = {l1,l2,l3};
		Arrays.sort(arr,new ramComparator());
		for (int i=0; i<arr.length; i++ )
	{
			System.out.println(arr[i]);
	}
		System.out.println("===========/n");
			Arrays.sort(arr,new priceComparator());
		for(int i=0; i<arr.length ;i++)
	{
		System.out.println(arr[i]);
	}
   }
 }
