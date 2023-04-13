import java.util.*;
class hashset2 
{
	public static void main(String[] args) 
{
		String s1="aaBBBccDDD";
		char[]arr=s1.toCharArray();
		HashSet<Character>hs=new HashSet<Character>();
		for(int i=0;i<arr.length;i++)
{
			hs.add(arr[i]);
}
		System.out.println(hs);
	for(char el:hs)
{
		int count=0;
		for(int i=0;i<arr.length;i++)
{
			if(el==arr[i])
{
				count++;
}
}
			System.out.println(el+"="+count);
 }
}
}