import java.util.Scanner;
class perfect
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=1,perfect=0;
		System.out.print("Enter number :");
		num=input.nextInt();
		
		while(i<num)
		{
			if(num%i==0)
				perfect+=i;
		i+=1;
		}
		if(perfect==num)
		    System.out.print("The number is a perfect number");
		else if(perfect<num)
			System.out.print("Deficient");
		else if(perfect>num)
			System.out.print("Abundant number");
	    else 
			System.out.print("The number is not a perfect number");
		
		
	}
}