import java.util.*;
class multipletable
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number:");
	int num=sc.nextInt();
	System.out.println("enter the range:");
	int range=sc.nextInt();
	System.out.println("the multiplication table is:");
	for(int i=1;i<=range;i++)
	{
		System.out.println(num+"x"+i+"="+(num*i));
	}
		sc.close();
	}
}

