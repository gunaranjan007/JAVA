import java.util.Scanner;
import java.lang.Math;
class kmurthynum
{
	
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,fin_fact=0,last_digit=0,result=0;
		
		System.out.print("Enter number:");
		num=input.nextInt();//43
		while(num!=0)
		{
			last_digit=num%10;
			fin_fact=fact(last_digit);//arg passing 
		
		num/=10;
		}//while ends	
		result+=fin_fact;
        System.out.print(result);		
	}//psvm ends
	static int fact(int d_last)// parameter 
	{
		int factorial=1;
		while(d_last!=1)
		{
			factorial=factorial*d_last;
			
		d_last-=1;
		}//while ends
		return(factorial);
	}
}// class ends	    
			