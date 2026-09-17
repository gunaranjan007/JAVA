import java.util.Scanner;
class polynomial
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num1=0,num2=0,num3=0,add12=0,add23=0,add13=0,add123=0;
		System.out.print("Enter Number 1");
		num1=input.nextInt();
		System.out.print("Enter Number 2");
		num2=input.nextInt();
		System.out.print("Enter Number 3");
		num3=input.nextInt();
	    add12=addfunc(num1,num2);
		System.out.print("Addition of"+num1+"and"+num2+"is"+add12);
			    add23=addfunc(num2,num3);
		System.out.print("Addition of"+num2+"and"+num3+"is"+add23);
			    add13=addfunc(num1,num3);
		System.out.print("Addition of"+num1+"and"+num3+"is"+add13);
			    add123=addfunc(num1,num2,num3);
		System.out.print("Addition of"+num1+"and"+num2+"is"+add12);
		
    }//psvm ends
	static int addfunc(int ddnum1,int ddnum2 )
	{
		int result=0;
		result=ddnum1+ddnum2;
	    return(result);
	}//2 parameter func ends
	static int addfunc(int dnum1,int dnum2,int dnum3)
	{
		int addresult=0;
		addresult=dnum1+dnum2+dnum3;
	    return(addresult);
	}//3 parameter func ends
	
}//class ends