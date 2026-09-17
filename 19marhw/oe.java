import java.util.Scanner;
class oe
{
	static Scanner input=new Scanner (System.in);
	public static void main(String args[])
	{
		int num=0,i=0,div_7=0;
		while(i<10)
		{
			System.out.print("Enter number:");
			num=input.nextInt();
			if(num%7==0)
			{
			   div_7+=1;
			}
		    i=i+1;
		
		}
		   
			System.out.print(+div_7+" Nubers are divisible by 7");
	}
}
		    