import java.util.Scanner;
import java.lang.Math;
class adam_forloop
{
	static double rev_sqrt=0;
	public static void main (String args[])
	{
		int num=0,result=0,reverse_square=0;
		for(num=1; num<101; num++)
		{
	     reverse_square=rev_func(num);
		 rev_sqrt=Math.sqrt(reverse_square);
		 int reverse_sqrt=(int)rev_sqrt;
		 result=findingAdam(reverse_sqrt);

		 if(result==num)
			System.out.println(num);
		
		}	
			
	
	}//psvm ends
	static int rev_func(int d_num)
	{
		int num_sq=0,last_digit=0,rev_sq=0;
		num_sq=(d_num*d_num);  //144
		while(num_sq!=0)
		{
			last_digit=num_sq%10;//4
			rev_sq=rev_sq*10+last_digit; //441
			num_sq/=10;
		}//1st while ends
		return(rev_sq);
	}
	static int findingAdam(int dreverse_sqrt)
	{
		//21
		int last=0,adam=0;
		while(dreverse_sqrt!=0)
		{
			last=dreverse_sqrt%10;
			adam=adam*10+last;
		dreverse_sqrt/=10;
		}//2nd while ends
		return(adam);
	}
	
}//class ends