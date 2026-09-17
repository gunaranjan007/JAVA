import java.util.Scanner;
class addmatrixusingFunction
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int row=0,col=0,noofArray=0;
		
		System.out.print("How many array to add");
		noofArray=input.nextInt();// get to know the number of Array
		
		int[][] Addmatrix =new int[row][col];
		
		for(int i=0;i<noofArray-1;i++)
		{
	
		System.out.print("Enter no of row");
		  row=input.nextInt();//get rows
		System.out.print("Enter no of column");
		  col=input.nextInt();// get column
		  int[][] arraymatrix=new int[row][col];
		  arraymatrix=Arrayinput(row,col);
		}
		for(int i=0;i<row-1;i++)
		{
			for(int j=0;j<col-1;j++)
			{
				Addmatrix[i][j]=arraymatrix[i][j]+arraymatrix[i][j];
			}
		}
		for(int Arraymatrix[]:Addmatrix)// Get row wise array from an matrix
		{
			for(int element:Arraymatrix)//Get each element from a an array
			{
				
				System.out.print(element+"\t");//print element
			}
		System.out.println();
		}
	}//psvm ends
	static int[] Arrayinput(int drow,int dcol)
	{
		int[][] Arraymatrix=new int[drow][dcol];//Element of row and column
		for(int i=0;i<drow;i++)
		{
			for(int j=0;j<dcol;j++)
			{
				Arraymatrix[i][j]=input.nextInt();//gets input matrix
			}
		}
		return(Arraymatrix);// Return  matrix to psvm
	}//func ends
}//class ends