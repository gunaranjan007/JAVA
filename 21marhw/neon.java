import java.util.Scanner;

class neon
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,n=0,r=0,z=0,result=0;
		System.out.print("Enter Number :");
		num=input.nextInt();
		
		n=num%10;
		r=num/10;
		 z=n+r;
         result=z*z;
		 
		 
		 
		
		if(result==num)
		   System.out.print("neon number");
	    else
			System.out.print("not a neon number");
	
		
		
	}
}
	