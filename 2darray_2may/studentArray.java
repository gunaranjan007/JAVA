import java.util.Scanner;
class studentArray
{
	final static int n=5;
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int totalMark=0,average=0;		
		int[] markArray=new int[n];// To get an mark of a student 
		char[] evalArray=new char[n];//to get an student pass or fail evaluation form function in form of array
		for(int i=0;i<n;i++)
		{
			markArray[i]=input.nextInt();// store the mark in an array
			totalMark+=markArray[i];
		}
		average=(totalMark/n);
		System.out.print("The Total Mark is:"+totalMark);
		System.out.println("The Average mark is :"+average);
		evalArray=evaluationcheck(markArray);//this  been get from the function called evaluation function
		for(char element:evalArray)
			System.out.print(element);
	}//psvm ends
	static char[] evaluationcheck(int[] dmarkArray)
	{
		char[] charArray=new char[n];
		for(int i=0;i<dmarkArray.length;i++)
		{
			if(dmarkArray[i]>35)
				charArray[i]='p';
			else
				charArray[i]='f';
		}
	return(charArray);
	}//func ends
}//class ends
				
		