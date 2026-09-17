import java.util.Scanner;
class pronic_for
{

	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,result=0;
		for(num=1; num<101; num++)
		{
		  result=pronic_func(num);
		  if(result==1)
			  System.out.println(num);
	                                       /**multiplying consecutive divisor to get same input n**/
		
		}//for loop ends
		
	}
	static int pronic_func(int d_num)
	{
		   int n=0,flag=0;
			while(n<d_num)
			{
				if(n*(n-1)==d_num)
				{
				   flag=1;
				   break;
				}
				
				
				
		    n+=1;
		    }//while loop ends
			return(flag);
		
	}//pronic func ends	
}