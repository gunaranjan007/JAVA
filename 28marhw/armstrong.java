import java.util.Scanner;
import java.lang.Math;
class armstrong
{
	
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,digit=0,last=0,number=0,n=0,fa=0;
		double ans=0;
		System.out.print("Enter number:");
		num=input.nextInt();
		number=num;
		n=number;
		while(num!=0)
		{
			if(num%10<=10)
				digit+=1;
		num/=10;
		}
		while(number!=0)
		{
			last=number%10;
			ans=ans+Math.pow(last,digit);
		number/=10;
		}
		fa=(int)ans;
		if(fa==n)
		   System.out.print("Armstrong Number");
	   else
		   System.out.print("not A armstrong");
	}//psvm ends
}// class ends	    
			
			
			  
		