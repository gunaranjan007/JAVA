import java.util.Scanner;
class transpose2dArray
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int n=3,m=3;
		int[][] Arraymatrix=new int[n][m];// n be rows and m be columns 
		System.out.println("Enter number for row major to transpose:");
		for(int i=0;i<n;i++)// for Rows
		{
			for(int j=0;j<m;j++)// for Columns
			{
				Arraymatrix[i][j]=input.nextInt(); // get a value and stored in an array matrix
			}
		}
		System.out.print("2d Array");
		for(int i=0;i<n;i++)// for Rows
		{
			for(int j=0;j<m;j++)// for Columns
			{
				System.out.print(Arraymatrix[i][j]);// to print the Array matrix
			}
		System.out.println();
		}
		System.out.print("Transpose Array");
		for(int i=0;i<n;i++)// for Rows
		{
			for(int j=0;j<m;j++)// for Columns
			{
				System.out.print(Arraymatrix[j][i]);// to print the Array matrix
			}
		System.out.println();
		}
	}//psvm ends
}//class ends