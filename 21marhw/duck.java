import java.util.Scanner;
class duck
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,n=0,flag=0;
		System.out.print("Enter Number :");
		num=input.nextInt();
		
		while(num!=0)
		{
			n=num%10;
			if(n==0)
			{
			    flag=1;
			}
			num=num/10;	
		}
			if(flag==1)
				System.out.print("duck number");
			else
				System.out.print("not a duck");
		
		
		
	}
}
		
			