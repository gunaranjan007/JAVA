import java.util.Scanner;
class stockvalueArray	
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int n=7,minstock=0,buyday=0,sellday=0,maxprofit=0,profit=0,minstockday=0;
		int[] arr = new int[n]; // assign the space to the array
		
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		minstock=arr[0];
		for(int i=1;i<n;i++)
		{
			profit=arr[i]-maxprofit;
			if(profit>maxprofit)
			{
				maxprofit=profit;
				sellday=i;
			}
			if(minstock<arr[i])
			{
				minstock=arr[i];
				minstockday=i;
			}
		}
		if(maxprofit>0)
		{
			
			System.out.println(minstockday);
			System.out.print(sellday);
		}
		
	}
}