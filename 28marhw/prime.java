import java.util.Scanner;
class prime
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=1,r=0;
		
		System.out.print("Enter Number :");
		     num=input.nextInt();
		while(i<=num)
		{
			if (num%i==0)
				r=r+1;
		i+=1;
		}
		if(r>2)
			System.out.print("no Prime number");
		else
			System.out.print(" prime");
		
		
			
			
	
	}
}