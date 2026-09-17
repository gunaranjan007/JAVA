import java.util.Scanner;
import java.lang.Math;
class d_kmurthynum
{
	
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,last_digit=0,result=0;
		
		System.out.print("Enter number:");
		num=input.nextInt();//32
		while(num!=0)
		{
			last_digit=num%10;//2
			int factorial=1;
			while(last_digit!=0)//condition
			{
				factorial=factorial*last_digit;//statement  /**  1*3=3,3*2=6,6*1=6 ***/	
				
			last_digit-=1;//iteration condition
			}
		
		result+=factorial;
		num/=10;
	    }//while ends	
	System.out.print(result);
	if(result==num)
			System.out.print("Krishnamurthy Number");
	else
			System.out.print("Not a krishnamurthy Number");	
		
		
	}//psvm ends

}// class ends	