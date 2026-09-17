import java.util.Scanner;
import java.lang.Math;
class armstrong_for
{
	static int digit=0;
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,armstrong=0;
		for(num=0; num<100;num++)
		{
	     digit=countofdigit(num);
		 armstrong=finding(num);
		
	    
		 if(armstrong==num)
		    System.out.println(num);
	     
		}
	}//psvm ends
	static int countofdigit(int d_num)
	{
		 int count_digit=0;
		while(d_num!=0)
		{
			if(d_num%10<=10)
				count_digit+=1;
		d_num/=10;
		}
		return(count_digit);
	}
	static int finding(int d_num)
	{
		int last=0,fa=0;
		double ans=0.0f;
		while(d_num!=0)
		{
			last=d_num%10;
			ans=ans+Math.pow(last,digit);
		d_num/=10;
		}
		fa=(int)ans;
		return(fa);
		
	}
		
		
}// class ends	    