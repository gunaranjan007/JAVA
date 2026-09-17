import java.util.Scanner;
class celtof
{
	public static void main(String args[])
	{
		float C=0.0f,F=0.0f;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter celsius :");
		C=input.nextFloat();
		F=(C*9/5)+32);
		System.out.print("The farenheit of given celsius is " + F);
	}
}
		
		
		