import java.util.Scanner;
class alphatoasterrisk
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String word;
	
		System.out.print("Enter any word:");
		word =input.nextLine();
	    String[] arr=word.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				String[] str=arr.replace(arr[j],"*");
				
			}
			
		}
		for(String element:str)
		{
			System.out.print(str);
		}
		
	}//psvm ends
}//class ends