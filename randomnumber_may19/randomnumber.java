import java.util.Scanner;
import java.lang.Math;
class randomnumber
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=25;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=(int)(Math.random()*25)+1;//random from0 to 1 in array 25 be range 
		}
	    for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}//loop ends
	}//psvm ends
}//class ends