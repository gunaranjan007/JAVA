import java.util.Scanner;
class kmurthycombine
{
	static Scanner input=new Scanner(System.in);
	public static void main(String[]  args)
	{
		int ans=0;
		System.out.print("Enter Number:");
		int i_num=input.nextInt();
		
		kmurthy_forclass resultobj= new kmurthy_forclass();
		ans=resultobj.kmurthynum(i_num);
		if(ans==i_num)
			System.out.print("Kmurthy number");
		else
			System.out.print("Not a kmurthy Number");
		
		
		
		
		
		
	}// psvm ends
}// class ends
		 
		
		