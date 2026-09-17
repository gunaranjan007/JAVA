import java.util.Scanner;
class submatrixfunc
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int row=0,col=0;
		
		System.out.print("Enter no of row in matrixs");
		  row=input.nextInt();//get rows
		System.out.print("Enter no of column in matrixs");
		  col=input.nextInt();// get column
		  
		int[][] Arraymatrix1=new int[row][col];
		int[][] Arraymatrix2=new int[row][col];
		int[][] Submatrix =new int[row][col];
	
			Arraymatrix1=Arrayinput(row,col);
			Arraymatrix2=Arrayinput(row,col);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Submatrix[i][j]=Arraymatrix1[i][j]-Arraymatrix2[i][j];
			}
		}
		for(int Arraymatrix[]:Submatrix)// Get row wise array from an matrix
		{
			for(int element:Arraymatrix)//Get each element from a an array
			{
				
				System.out.print(element+"\t");//print element
			}
		System.out.println();
		}
	}//psvm ends
	static int[][] Arrayinput(int drow,int dcol)
	{
		System.out.print("Enter number in row  major to form matrix");
		int[][] matrix=new int[drow][dcol];//Element of row and column
		for(int i=0;i<drow;i++)
		{
			for(int j=0;j<dcol;j++)
			{
				matrix[i][j]=input.nextInt();//gets input matrix
			}
		}
		return(matrix);// Return  matrix to psvm
	}//func ends
}//class ends