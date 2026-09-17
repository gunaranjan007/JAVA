class twistedprime_forloop
{
	public static void main(String args[])
	{
		int num=0,prime=0,inter=0,final_ans=0;
		for(num=1; num<101; num++)
		{
	
		 prime=checkPrime(num);//arg passing 
		 if (prime==0)
		 {	
			inter=change(num);
		    final_ans=checkPrime(inter);
			
			if (final_ans==0)
				System.out.println(num);
		 }
		 
		}
	}//psvm ends
	
	static int checkPrime(int d_num) //parameter
	{
		int i=2, flag=0;
		while (i<d_num)
		{                                        /** checking prime or not **/
			if (d_num %i==0)
				flag=1;
		i+=1;
		}//while ends
		return (flag);
	}//prime func ends
	
	static int change(int dummy_num)//parameter
	{
		int last_digit=0,ans=0;
		while(dummy_num!=0)
		{
			last_digit=dummy_num%10;
		    ans=ans*10+last_digit;                       /** Number changing**/
			
		dummy_num/=10;
		}
		return (ans);
	}//change ends
}
			
		
		
		
		
		
	