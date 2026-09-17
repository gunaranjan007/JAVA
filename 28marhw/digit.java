import java.util.Scanner;
class digit
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,count=0;
		System.out.print("Enter number:");
		num=input.nextInt();
		do
		{
			if(num%10<=10)
				count+=1;
		num/=10;
		}while(num!=0)
	
		System.out.print(count);
	}//psvm ends
	
}//class ends

/*** 	while(num!=0)
		{
			if(num%10<=10)
				r=r+1;
		num/=10;
		} ****/