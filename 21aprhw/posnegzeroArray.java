import java.util.Scanner;
class posnegzeroArray
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int pos=0,neg=0,zero=0,n=10;
		int[] arr=new int[n];//element address initialization
		System.out.print("Enter number to save in array");
		for(int i=0;i<n; i++)
		{
			arr[i]=input.nextInt();
			if(arr[i]>0)
				pos++;
			else if(arr[i]<0)
				neg++;
			else
				zero++;
		}
		System.out.println("Positive are"+pos);
		System.out.println("Negative are"+neg);
		System.out.println("zeros were"+zero);
		
	}
}
		