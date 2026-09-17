import java.util.Scanner;
class si
{
	public static void main (String args[])
	{
		float si=0.0f, p=0.0f,n=0.0f,r=0.0f,a=0.0f ;
		Scanner input=new Scanner (System.in);
		System.out.print("the principle amt :");
		p=input.nextFloat();
		System.out.print("the no of years :");
		n=input.nextFloat();
		System.out.print("the rate of interest:");
		r=input.nextFloat();
		si=(p*n*r)/100;
		System.out.print("the Si is "+si);
		a=p+si;
		System.out.print("the amt repay is " +a);
	}
}
