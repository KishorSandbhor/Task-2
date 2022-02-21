import java.util.*;
class calculator
{
	
	Scanner obj=new Scanner(System.in);
	int a,b;
    void accept()
    {
	System.out.println("enter two numbers =");
	a=obj.nextInt();
	b=obj.nextInt();
     }
	
	void add()
	{
	int c;
	c=a+b;
	System.out.println("add="+c);

	}
	void sub()
	{
	int c;
	c=a-b;
	System.out.println("sub="+c);

	}
	void multi()
	{
	int c;
	c=a*b;
	System.out.println("multi="+c);

	}
	void div()
	{
	int c;
	c=a/b;
	System.out.println("div="+c);

	}
}
class Add1
{
	public static void main(String args[])
	{
		calculator c1=new calculator();
		c1.accept();
		c1.add();
		c1.sub();
		c1.multi();
		c1.div();
	}
}