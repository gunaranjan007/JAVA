class perfectnum_forloop
{
	public static void main (String args[])
	{
		int num=0,i=1,ans=0;
		for(num=1; num<101; num++)
		{
		
		 while(i<num)
		 {
			if(num%i==0)
				ans=ans+i;
		 i+=1;
		 }
		if(ans==num)
		    System.out.print(num+" Perfect");
		
		}// for loop ends
	}//psvm ends
}// class ends