import java.util.Scanner;
class addmatrix
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int row=3,col=3;
		int[][] Arraymatrix1=new int[row][col];//  rows and  columns 
		int[][] Arraymatrix2=new int[row][col];
		int[][] addmatrix=new int[row][col];
		
		System.out.println("Enter 1st matrix in order of row major to Add:");
		for(int i=0;i<row;i++)// for Rows
		{
			for(int j=0;j<col;j++)// for Columns
			{
				Arraymatrix1[i][j]=input.nextInt(); // get a value and stored in an array matrix
			}
		}
		System.out.println("Enter 2nd matrix in order of row major to Add:");
		for(int i=0;i<row;i++)// for Rows
		{
			for(int j=0;j<col;j++)// for Columns
			{
				Arraymatrix2[i][j]=input.nextInt(); // get a value and stored in an array matrix
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				addmatrix[i][j]=Arraymatrix1[i][j]+Arraymatrix2[i][j];//addition of matrix
			}
		System.out.println();
		}
		
		System.out.print("Addition matrix\n");
		for(int Arraymatrix[]:addmatrix)//get row wise array from an matrix
		{
			for(int element:Arraymatrix)//)//get each element from a an array
			{
				
				System.out.print(element+"\t");//print element
			}
		System.out.println();
		}
	}// psvm ends
}//class ends