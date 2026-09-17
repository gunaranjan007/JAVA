import java.util.Scanner;
class find
{
	static Scanner input=new Scanner (System.in);
	public static void main(String args[])
	{
		int num=0,n=0,r=0;
		System.out.print("Enter the Number:");
			num=input.nextInt();
		while(num/10!=0)
		{
			n=num%10;
			r+=n;
		num=num/10;
		
		
		}
		System.out.println(r);
		
		
		 
	}
}
	