import java.util.Scanner;
class atm
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int pin=0,crt_pin=0,flag=0,last_digit=0;
		
		System.out.print("Enter PIN:");
		pin=input.nextInt();
		
		crt_pin=(int) pin;   //type casting 
		
		while(crt_pin!=0)
		{
			last_digit=crt_pin%10;
			if(last_digit<10)
				flag=1;
			else
				flag=0;
		crt_pin/=10;
		}
			
		
		 if(flag==1)
		    System.out.print("Next process to proceed");
	     else
			 System.out.print("Invalid");
		 
			
    }
}	