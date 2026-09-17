import java.util.Scanner;
class second_smaller
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i_num=0,min=0,sec_min=0,i=0;
		System.out.print("Enter Number:");
		num=input.nextInt();
		min=num;
		sec_min=num;
		
		while(i<9)
		{
			System.out.print("Enter Number:");
			i_num=input.nextInt();
			if(i_num<min)
			{
				sec_min=min;
				min=i_num;
			}
			else if(i_num>min && i_num<sec_min)
				sec_min=i_num;
	        	
				
				
		i+=1;
		}//while ends
		System.out.print(sec_min);
	}//psvm ends
}//class ends
			  
	
