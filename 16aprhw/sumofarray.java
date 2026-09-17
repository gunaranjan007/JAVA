import java.util.Scanner;
class sumofarray
{
	static Scanner input=new Scanner(System.in);
	public static void main(String [] args)
	{
		int i=0,n=10,sum=0;
		int[] arr=new int[n];
		for(i=0; i<n;i++)
		{
			arr[i]=input.nextInt();
			sum=sum+arr[i];
		}
	
		System.out.print(sum);
	}
}	