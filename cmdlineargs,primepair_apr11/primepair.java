class primepair
{
	public static void main(String [] args)
	{
		int PrimePair=0;
		for(int n=1; n<101;n++)
		{
			for(int i=2; i<n ;i++)
			{
				if(n%i==0)
				{
					PrimePair=n;
					break;
				}
			}
		}
	}
}