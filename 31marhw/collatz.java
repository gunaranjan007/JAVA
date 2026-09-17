import java.util.Scanner;
class collatz
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,collatz=0;
		System.out.print("Enter Number:");
		num=input.nextInt();
		collatz=ans(num);      // arg passing 
		System.out.print(collatz);
	}//psvm ends
	static int ans(int d_num) // parameter
	{
		int count=0,cou=0,fin=0;
		while(d_num!=1)
		{
			if (d_num%2==0)
			{
				d_num=d_num/2;
			    count+=1;
			}
			else
			{
		
				d_num=(3*d_num+1);
			    cou+=1;
			}
			
		
		}
		fin=cou+count;
		return(fin);
		
	}//ans func ends
	

}//class ends