
class forloop_prime
{
	public static void main (String args[])
	{
		int num=0,prime=0;
		for(num=1; num<101; num++)
		{
			prime=primefunc(num);
			if(prime==0)
				System.out.println(num);			
		}
	}
    static int primefunc(int d_num)
	{
		int i=2,flag=0;
		do
		{
			if(d_num%i==0)
				flag=1;
		}while(i<d_num);
		return(flag);
	}
		
		
	
}