import java.util.Scanner;
class enchforloopinTranspose
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
		for(int Arrayrow[]: Arraymatrix)// get a array row from an 2d array
		{
			for(int element: Arrayrow)// get an element in an array
			{
				System.out.print(element);// print element
			}
		System.out.println();
		}
		System.out.print("hello");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j>m;j++)
			{
				System.out.print(Arraymatrix[j][i]);
			}
		System.out.println();
		}
	}// psvm ends
}//class ends