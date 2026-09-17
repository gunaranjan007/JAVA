import java.util.Scanner;
class sampleasterrisk
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String word;
		
		System.out.print("Enter Any Word:");
		word=input.nextLine();
		String[] sp=word.split(" ");
		char[][] arr=new char[sp.length][];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr[i].length;j++)
			{
				arr[i][j]='*';
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
		}
		
	}
}//class ends