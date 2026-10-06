class Lambda
{
	public static void main(String args[])
	{
		int x=10,y=20;
		Lambda ld=new Lambda();	
                            		//Body of lamda 
		mathFunction add=(a,b) -> { a+=100; return (a+b);};
		mathFunction sub=(a,b) ->  (b-a);
		mathFunction mul=(a,b) -> { int n=a*2;return (n*b);};
		mathFunction div=(a,b) -> (a/b);
		mathFunction mod=(a,b) -> (a%b);
		
        System.out.println(ld.operate(x,y,add));//1
		System.out.println(ld.operate(x,y,sub));
		System.out.println(add.operation(x,y));
		System.out.println(ld.operate(x,y,mul));
		System.out.println(ld.operate(x,y,mod));
		System.out.println(ld.operate(x,y,div));
		
		
	}
	interface mathFunction //Always int return-ing  
	{
		int operation(int a,int b);
		int operation(int a,int b,int c);
	}
	private static int operate(int a,int b,mathFunction m)//1
	{
		return (m.operation(a,b));
		
	}
	private static int operate1(int a,int b,int c,mathFunction math)
	{
		return (math.operation(a,b,c));
		
	}
}