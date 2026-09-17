import java.util.Scanner;
class pronic
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,n=0,flag=0;
		System.out.print("Enter Number:");
		num=input.nextInt();            //2*3=6 // consecutive number 2 and 3 are
		while(n<num)
		{
			if((n*(n-1))==num)
				flag=1;
		n+=1;
		}
		if(flag==1)
			System.out.print("Pronic Number");
		else 
			System.out.print("Not Pronic");
	}
}
		