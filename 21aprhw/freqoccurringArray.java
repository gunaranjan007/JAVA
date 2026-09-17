import java.util.Scanner;
class freqoccurringArray
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=10,num=0,freq_occurring=0;
		int[] arr=new int[n];//element address initialization
		System.out.print("Enter number to store in array :");
		for(int i=0;i<n; i++)
		{
			arr[i]=input.nextInt();  //storing value in an array
		}
		System.out.print("Enter number to check if it is in array");
		num=input.nextInt();
		for(int i=0;i<n; i++)
		{
			if(arr[i]==num)
				freq_occurring++;
			
			
		}//for loop ends
		System.out.print(freq_occurring);
	}//psvm ends
}//class ends