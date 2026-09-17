import java.util.Scanner;
class min
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=0,num_i=0,min=0;
		System.out.print("Enter number:");
		num=input.nextInt();
		min=num;
		while(i<9)
		{
			System.out.print("Enter number:");
			num_i=input.nextInt();
			if(num_i<min)
				min=num_i;
		i+=1;
		}
		System.out.print(min);		
	
	}
}