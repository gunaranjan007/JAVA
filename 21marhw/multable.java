import java.util.Scanner;
class multable
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		
		int i=1,num=0,mul=0;
		System.out.print("Enter the number:");
		num=input.nextInt();
		while(i<=15)
		{
			mul=i*num;
			System.out.printf("%2d * %2d is %3d\n",i,num,mul);
		    //System.out.print(i+" *  "+num+" is "+mul+"\n");
			i=i+1;
		}
	}
}
			
		
