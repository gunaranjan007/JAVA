class pythgorustriplet
{
	public static void main(String args [])
	{
		for (int a=1; a<99 ;a++)
		{
			for(int b=(a+1); b<100; b++)
			{
				for(int c=(b+1); c<101; c++)
					{
						if((c*c)==((a*a)+(b*b)))
						System.out.println( a+ " " + b + " " + c);
					}
			}
		}
	}
}