import java.util.Scanner;
class second_larger
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num=0,i=0,i_num=0,min=0,max=0,sec=0;
		System.out.print("Enter Number:");
		num=input.nextInt();
		max=num;
		
		while(i<4)
		{
			System.out.print("Enter Number:");
			i_num=input.nextInt();
			if(i_num>max)
			{
				max=i_num;
				sec=max;
			}
			if(i_num<sec && )
				min=i_num;
		i+=1;
		}
		System.out.print(sec);
	}
}
				