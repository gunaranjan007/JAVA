import java.util.Scanner;
class flagprime
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,prime=0;
		
		System.out.print("Enter Number :");
		     num=input.nextInt();
		prime=check(num);//args
		if(flag==1)
			System.out.print("no Prime number");
		else
			System.out.print(" prime");
	}//psvm ends
	static int check(d_num)//parameter 
	{
		while(i<=d_num)
		{
			if (d_num%i==0)
				flag=1;
			break;
		i+=1;
		}
	}//func ends
}