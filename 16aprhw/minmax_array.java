import java.util.Scanner;
class minmax_array
{
	
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		int max=0,min=0,range=0;
		int[] arr=new int[10];   // Initaializes the 10 address for array 
		
		for(int i=0; i<=10; i++)
		{
			arr[i]=input.nextInt();   // stores a integer in array
		}
		for(int i=0;i<=10;i++)
		{
		  max=arr[0];    // setting beginning index values as minimum and maximum
		  min=arr[0];
		  
		    if(arr[i]>max)
		    {
			  max=arr[i];
			  min=max;
		    }
           else
		   {
			 min=arr[i];
		   }
		
		
		}
		
		System.out.print(max);
		System.out.print(min);
		range=max-min;
		System.out.print(range);
		
	}
}
		
		