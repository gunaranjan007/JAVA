class j
{
	public static void main (String args[])
	{
		int[] arr={0,1,0,3,12};
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]++;
			}
		j++;
		}
		
		
		for(int ele:arr)
		  System.out.println(ele);
	}
}