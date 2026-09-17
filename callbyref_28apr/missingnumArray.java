import java.util.Scanner;
class missingnumArray	
{
	
	public static void main (String args[])
	{
		int missingnum=0;
		int[] arr={1,2,4,5,6,8};
		///////////0,1,2,3// subscript or index
	  for(int i=0;i<arr.length;i++)
	  {
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=j)
				missingnum=j;
		}
	  }//for loops ends
	  System.out.println(missingnum);
	}//psvm ends
}//class ends
				
					
			