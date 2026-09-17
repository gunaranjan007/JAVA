import java.util.Scanner;
class palindrome
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,rev=0,last_digit=0,r=0;
		System.out.print("Enter number:");
		num=input.nextInt();
		r=num;
		while(num!=0)
		{
			last_digit=num%10;
			rev=rev*10+last_digit;
			num=num/10;
		}	
		if(rev==r)
			System.out.print("Palindrome");
		else
			System.out.print("not palindrome");
	}//psvm ends
	
	
}//class ends