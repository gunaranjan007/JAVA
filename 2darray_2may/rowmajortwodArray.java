import java.util.Scanner;
class rowmajortwodArray
{ ///ROW MAJOR MATRIX
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int n=3,m=3;
		int[][] Arraymatrix=new int[n][m];// n be rows and m be columns 
		System.out.println("Enter number for row major:");
		for(int i=0;i<n;i++)// for Rows
		{
			for(int j=0;j<m;j++)// for Columns
			{
				Arraymatrix[i][j]=input.nextInt(); // get a value and stored in an array matrix
			}
		}
		for(int i=0;i<n;i++)// for Rows
		{
			for(int j=0;j<m;j++)// for Columns
			{
				System.out.print(Arraymatrix[i][j]);// to print the Array matrix
			}
		System.out.println();
		}
	}//psvm ends
}//class ends
		
		
				