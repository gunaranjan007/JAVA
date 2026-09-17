import java.util.Scanner;
class zerotoendArray	
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int[] arr={0,1,2,0,4,5}; // storing a value and also initiales the space in memory
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==0)
				{
					arr[j]=arr[i];
					arr[i]=arr[j];
				}
			}
		}
		for (int element:arr)
			System.out.print(element);
	}
}

				
			
				