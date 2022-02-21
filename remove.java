import java.util.*;
class remove
{
	public static void main(String srgs[])
		{
			int[] a={10,20,30,70,60,90};
			int delete=70;
			for(int i=0;i<a.length;i++)
			{
				if(delete==a[i])
				{
					for(int j=i;j<a.length-1;j++)
					{
						a[i]=a[j+1];
					}	
				break;		
				}
			}
			for(int i=0;i<a.length-1;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
}