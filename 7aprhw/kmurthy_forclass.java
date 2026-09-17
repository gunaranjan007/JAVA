
class kmurthy_forclass
{
	public static int kmurthynum(int num)
	{
		
		int last_digit=0,result=0;
		while(num!=0)
		{
			last_digit=num%10;//2
			int factorial=1;
			while(last_digit!=0)//condition
			{
				factorial=factorial*last_digit;//statement  /**  1*3=3,3*2=6,6*1=6 ***/	
				
			last_digit-=1;//iteration condition
			}
		
		result+=factorial;
		num/=10;
	    }//while ends
		return(result);
		
	}
}
	