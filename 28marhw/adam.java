import java.util.Scanner;
import java.lang.Math;
class adam
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,num_sq=0,last_digit=0,rev_sq=0,n=0;
		double rev_sqrt=0,last=0,adam=0;
		System.out.print("Enter number:");
		num=input.nextInt(); //12
		n=num;
		num_sq=(num*num);  //144
		while(num_sq!=0)
		{
			last_digit=num_sq%10;//4
			rev_sq=rev_sq*10+last_digit; //441
			num_sq/=10;
		}//1st while ends
		rev_sqrt=Math.sqrt(rev_sq);//21
		while(rev_sqrt!=0)
		{
			last=rev_sqrt%10;
			adam=adam*10+last;
			rev_sqrt/=10;
		}//2nd while ends
		if(adam==n)
			System.out.print("Adam Number");
		else
			System.out.print("Not Adam number");
			
			
	
	}//psvm ends
	
	
}//class ends