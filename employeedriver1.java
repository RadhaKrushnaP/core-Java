class SalaryException extends RunTimeException 
{
	@Override
		public String getMessage()
	{
		return "salary cannot be negetive";
	}
	@Override
		public String toString()
	{
		System.out.println(getMeassage());
		return "idoit enter the correct salary";
	}
}
	class employee
	{
		String name;	
		int salary;
		employee(String name, int salary)
	{
			this.name=name;
		if (salary<0)
	{
		throw new SalaryException();
	}
     else
	{
		 this.salary=salary;
	}
	}
	@Override
    public String toString()	
	{
     return "name: "+name+"salary: "+salary;
	}
	}
	class employeedriver1
	{
	public static void main(String[] args) 
	{
		employee e1 = new employee("lala",100000);
		System.out.println(e1);
		employee e2 = new employee ("tinku",-100000);
		System.out.println(e2);
	}
}
}