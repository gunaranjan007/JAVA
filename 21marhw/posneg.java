import java.util.Scanner;
class posneg
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num=0,i=0,pos=0,neg=0,zero=0;
		while(i<=10)
		{
			System.out.print("Enter The number :");
		    num=input.nextInt();
			if(num>0)
				pos=pos+1;
			else if(num==0)
				zero=zero+1;
			else 
				neg=neg+1;
			
			i+=1;
		}//while ends
		System.out.print("Positive's are"+pos);
			System.out.println("Zero's are"+zero);
			System.out.println("Negative's are"+neg);		
	}//psvm ends
}//class ends	
			