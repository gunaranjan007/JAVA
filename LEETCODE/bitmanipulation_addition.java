class bitmanipulation_addition
{
	public static void main(String args[])
	{
		int a=3 ,b=2;
		
		int sum=a^b;
		int carry=(a&b)<<1;
		int result=sum|carry;
		
		System.out.print(sum + "\n"+ carry);
		
		System.out.println(result);
	}
}