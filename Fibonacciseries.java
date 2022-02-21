import java.util.*;
class Fibonacciseries
{
	public static void main(String args[])
	{
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("n=");
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
		int c;
		c=a+b;
		System.out.println(""+c);
		a=b;
		b=c;
		}
	}
}