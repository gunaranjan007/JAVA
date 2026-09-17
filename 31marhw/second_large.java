import java.util.Scanner;
class second_large
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i_num=0,max=0,sec_max=0,i=0;
		System.out.print("Enter Number:");
		num=input.nextInt();
		max=num;
		sec_max=num;
		
		while(i<9)
		{
			System.out.print("Enter Number:");
			i_num=input.nextInt();
			if(i_num>max)
			{
				sec_max=max;
				max=i_num;
			}
			else if(i_num<max && i_num>sec_max)
				sec_max=i_num;
	        	
				
				
		i+=1;
		}//while ends
		System.out.print(sec_max);
	}//psvm ends
}//class ends
			  
			
			