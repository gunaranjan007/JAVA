import java.util.Scanner;
class swhile
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,sum=0,i=0;
		
		while(i<10)
		{
			System.out.print("Enter the Number :");
			num=input.nextInt();
			sum+=num;
			i=i+1;
		
		}
			System.out.print("The sum of all the 10 numbers is "+sum);
	}
}
			
			
		