import java.util.Scanner;
class reverse
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,rev=0,last_digit=0;
		System.out.print("Enter number:");
		num=input.nextInt();
		while(num!=0)
		{
			last_digit=num%10;
			rev=rev*10+last_digit;
			num=num/10;
		}	
		System.out.print(rev);
	}//psvm ends
	
	
}//class ends