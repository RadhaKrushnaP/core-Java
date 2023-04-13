import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		int temp=number;
		int rem,cube=0;
		while(temp>0)
{
			rem=temp%10;
			cube=cube +(rem*rem*rem);
			temp=temp/10;
}
	     if(number==cube)
{
		System.out.println("Armstrong");
}
	     else
{
		System.out.println("not Armstrong");
}
}
}