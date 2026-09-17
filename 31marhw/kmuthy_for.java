
import java.util.Scanner;
class kmurthy_for
{	
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int i_num=0,ans=0;

		for(i_num=1; i_num<101;i_num++)
		{
		ans=fact(i_num);
		if(ans==i_num)
			System.out.println(ans);
		
	  	
		}
	}//psvm ends
	static int fact(int num)
	{
		int last_digit=0,result=0;
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
		return(result);
	}
}// class ends	