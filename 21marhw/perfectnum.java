import java.util.Scanner;
class perfectnum
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=1,r=0;
		System.out.print("Enter number :");
		num=input.nextInt();
		
		while(i<num)
		{
			if(num%i==0)
				r=r+i;
		i+=1;
		}
		if(r==num)
		    System.out.print("The number is a perfect number");
	    else 
			System.out.print("The number is not a perfect number");
		
		
	}
}