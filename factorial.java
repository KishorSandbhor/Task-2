import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+no+"is"+fact);
	}

}