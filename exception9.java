class NotValidException extends Exception 
{
	@Override
		public String getMessage()
	{
		return "NotValidException";
	}
    }
	class exception9
	{
  public static void main(String[] args) 
	{
	  String hello="hello 1";
	  if(hello.equals("hello"))
	{
	  System.out.println("success");
	}
	   else
	{
		try
	{
		throw new NotValidException();
	}
		catch(NotValidException e)
	{
		System.out.println("NVE handled");
		System.out.println(e.getMessage());
	}
   }
 }
}