import java.util.Scanner;
class ddi
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=1,r=0,n=0;
		System.out.print("Enter number :");
		num=input.nextInt();
		
		while(i<num)
		{
			n=num%i;
			r=r+i;
			if(n==0 && r==num)
				System.out.println(r);
				
				
			
			
		i+=1;
		}

			
		
		
		
	}
}