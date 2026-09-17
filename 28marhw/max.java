import java.util.Scanner;
class max
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=0,numm=0,max=0;
		System.out.print("Enter number:");
		num=input.nextInt();
		max=num;
		while(i<9)
		{
			System.out.print("Enter number:");
			numm=input.nextInt();
			if(numm>max)
				max=numm;
		i+=1;
		}
		System.out.print(max);		
	
	}
}