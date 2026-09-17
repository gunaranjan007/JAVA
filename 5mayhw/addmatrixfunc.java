import java.util.Scanner;
class addmatrixfunc
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
		int[][] Addmatrix =new int[row][col];
	
			Arraymatrix1=Arrayinput(row,col);
			Arraymatrix2=Arrayinput(row,col);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Addmatrix[i][j]=Arraymatrix1[i][j]+Arraymatrix2[i][j];
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
	static int[][] Arrayinput(int drow,int dcol)
	{
		System.out.print("Enter number in row  major to form matrix");
		int[][] inputmatrix=new int[drow][dcol];//Element of row and column
		for(int i=0;i<drow;i++)
		{
			for(int j=0;j<dcol;j++)
			{
				inputmatrix[i][j]=input.nextInt();//gets input matrix
			}
		}
		return(inputmatrix);// Return  matrix to psvm
	}//func ends
}//class ends