import java.util.Scanner;
class callbyreference	
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int n=3;
		int[] arr = new int[n]; // assign the space to the array
		System.out.print("Enter the Number :");
	    	for(int i=0; i<n; i++)
			{
				arr[i]=input.nextInt();// stores the value in an array
			}
		func(arr);
		for(int ele:arr)//   which is enchanced for loop
			System.out.println(ele);
	}
	static void func(int[] darr)
	{
		for(int i=0;i<darr.length;i++)     // it does not sends any duplicate instead it sends the same array with diff name (parameters) because of its memory **actually it has not returned any value but in real array it got changed thats called as call by reference 
		{
			darr[i]=darr[i]+10;
	    }
	}
}
		