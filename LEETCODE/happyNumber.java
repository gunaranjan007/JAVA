class happyNumber
{
    public static void main(String args[])
	{
		int n=19;
        boolean result=false;
		
		int lastDigit=0;
		int ans=0;
		
		while(n!=1)
		{
			lastDigit=n%10;
			while(lastDigit!=0)
			{
				ans+=lastDigit*lastDigit;
			}
		n=ans;
		}
		result=true;
		System.out.print(result);
		
	
    }
}