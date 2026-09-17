import java.util.Scanner;
class evenoddArray
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int even=0,odd=0,n=10;
		int[] arr=new int[n];//element address initialization
		System.out.print("Enter number to save in array");
		for(int i=0;i<n; i++)
		{
			arr[i]=input.nextInt();   ///stores the value in an array subscript
			if(arr[i]%2==0)
				even+=1;
			else
				odd+=1;
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
		
			
