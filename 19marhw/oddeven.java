import java.util.Scanner;
class oddeven
{
	static Scanner input=new Scanner (System.in);
	public static void main(String args[])
	{
		int num=0,i=0,even=0,odd=0;
		
		while(i<10)
		{
			System.out.print("Enter the Number:");
			num=input.nextInt();
			
			if(num%2==0)
			{	
		      even+=1;
			}
			odd=10-even;
		i=i+1;
			
		
		}
		System.out.println("The even number is"+even);
		System.out.println("The odd numbers are"+odd);
		
		 
	}
}
		