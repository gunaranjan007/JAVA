import java.util.Scanner;
class  changingfreoccunum
{
	final static int n=10;
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int freq=0,countElement=0; // initializes the elements for an array
		int[] arr = new int[n]; // assign the space to the array
		System.out.print("Enter the Number :");
	    	for(int i=0; i<n; i++)
			{
				arr[i]=input.nextInt();// stores the value in an array
			}
			
			freqcheckfunc(arr);
			
			for(int ele:arr)
			{
				if(ele>0)
					countElement++;
					
			}
			System.out.print("Unique Numbers are "+countElement);
	}
			
	static void freqcheckfunc(int[] darr)
	{
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(darr[i]==darr[j])
					{
						darr[j]=0;
						
					}
			    }
			
			}
	}
			
			
            			  
				
	
}	
	
		
		
		