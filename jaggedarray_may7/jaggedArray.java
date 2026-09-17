import java.util.Scanner;
class jaggedArray
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int[][] arr=new int[4][];//rows be four and be in horizontal so main array element is be 4
		arr[0]=new int[4];
		arr[1]=new int[3];//intializes the column element  space be 4,3,2,1 for each row
		arr[2]=new int[2];
		arr[3]=new int[1];
		
		for(int i=0;i<arr.length;i++)//Be main Array
		{
			for(int j=0;j<arr[i].length;j++)// Be inside of main array
			{
				arr[i][j]=input.nextInt();
			}
		}//loop ends
		for(int i=0;i<arr.length;i++)//Be main Array
		{
			for(int j=0;j<arr[i].length;j++)// Be inside of main array
			{
				System.out.print(arr[i][j]);
			}
		System.out.println();
		}//outer loops ends
	}//psvm ends
}//class ends
		
				
		
	