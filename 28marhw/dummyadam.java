import java.util.Scanner;
import java.lang.Math;

class dummyadam
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int i_num=0,num_sq=0,last_digit=0,rev_sq=0,rev_sqrt=0,last_rev=0,adam=0,ans=0;
		double sqrt=0.0f;
		System.out.print("Enter number:");
		i_num=input.nextInt(); //12
		ans=i_num;
		num_sq=(i_num*i_num);  //144y
	   while(num_sq!=0)
		{
			last_digit=num_sq%10;//4
			rev_sq=rev_sq*10+last_digit; //441
			num_sq/=10;
		}//1st while ends
		sqrt=Math.sqrt(rev_sq);//21
		
		rev_sqrt=(int) sqrt; //type casting 
		
		while(rev_sqrt!=0)
		{
			last_rev=rev_sqrt%10;
			adam=adam*10+last_rev;
			rev_sqrt/=10;
		}//2nd while ends
		if(adam==ans)
			System.out.print("Adam Number");
		else
			System.out.print("Not Adam number");
			
			
	
	}//psvm ends
	
	
}//class ends