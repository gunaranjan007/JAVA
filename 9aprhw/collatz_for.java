
class collatz_for
{
	public static void main (String args[])
	{
		int num=0,collatz=0;
		for(num=1 ;num<101; num++)
		{
		   collatz=ans(num);      // arg passing 
		   System.out.println(num+" "+collatz);
		}
	}//psvm ends
	static int ans(int d_num) // parameter
	{
		int count=0;
		while(d_num!=1)
		{
			if (d_num%2==0)
			
				d_num=d_num/2;
			
			else
			
		
				d_num=(3*d_num+1);
		count+=1;
		
		}
		
		return(count);
		
	}//ans func ends
	

}//class ends