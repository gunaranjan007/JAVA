import java.util.Scanner;
class buzz
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,flag=0;
		System.out.print("Enter Number :");
		num=input.nextInt();
		if (num%7==0)
			flag=1;
		
		while(num!=0)
		{
			if( num%10==7)
				flag=1;
			
		num=num/10;
		}
		if(flag==1)
				System.out.print("BUZZ NUMBER");
		
		else
				System.out.print("NOT BUZZ");
			
			
	
	}
}
	