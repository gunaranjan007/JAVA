import java.util.Scanner;
class atm
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int pin=0,crt_pin=0,flag=0,last_digit=0,digit=0;
		
		System.out.print("Enter PIN:");
		pin=input.nextInt();
		digit=countofdigit(pin);
		if(digit>4)
			System.out.print("Enter four digit pin");
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
		    System.out.print("your pin is an integer");
	     else
			 System.out.print("Invalid");
		 
			
    }
	static int countofdigit(int d_pin)
	{
		int digitCount=0;
		while(d_pin!=0)
		{
			if(d_pin/10<=10)
				digitCount+=1;
		}//while loop ends
		return(digitCount);
	}//countofdigit func ends
			
}	