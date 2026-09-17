import java.util.Scanner;
class divisor
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=1;
		System.out.print("Enter number :");
		num=input.nextInt();
		
		while(i<=num)
		{
			if(num%i==0)
				System.out.println(i);
				
		i+=1;
		}
		
		
		
	}
}