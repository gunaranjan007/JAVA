import java.util.Scanner;
class bankteller
{
	static Scanner input =new Scanner(System.in);
	public static void main(String args[])
	{
		// I have 500,200,100,50,20,10,5
		
		int amount=0,count_500=0,count_200=0,count_100=0,count_50=0,count_20=0,count_10=0;
		System.out.print("Enter Amount:");
		amount=input.nextInt();
		
		
		while(amount!=0)
		{
			if(amount>=500)
			{
				amount-=500;;
				count_500+=1;
			}
			else if(amount>=200)
			{
				amount-=200;
				count_200+=1;
			}
			else if(amount>=100)
			{
				amount-=100;
				count_100+=1;
			}
			else if(amount>=50)
			{
				amount-=50;
				count_50+=1;
			}
			else if(amount>=20)
			{
				amount-=20;
				count_20+=1;
			}
			else if(amount>=10)
			{
				amount-=10;
				count_10+=1;
			}
		
		}
		System.out.println("500 notes"+count_500);
		System.out.println("200 notes"+count_200);
		System.out.println("100 notes"+count_100);
		System.out.println("50 notes"+count_50);
		System.out.println("20 notes"+count_20);
		System.out.println("10 notes"+count_10);
	}
}
			