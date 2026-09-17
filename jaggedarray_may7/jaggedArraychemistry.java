import java.util.Scanner;
import java.lang.Math;
class jaggedArraychemistry
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int s1=0,s2=0,s3=0,student=0;
		float staff_it=0.0f,closest=0.0f,minclosest=0.0f,place=0.0f;
		System.out.print("Enter Staff's Iteration:");
		staff_it=input.nextFloat();
		
		float [][]  arr=new float[3][];// 3 be row and student
		System.out.print("how Many it s1 got:");
		s1=input.nextInt();
		System.out.print("how Many it s2 got:");
		s2=input.nextInt();
		System.out.print("how Many it s3 got:");
		s3=input.nextInt();
		arr[0]=new float[s1];
		arr[1]=new float[s2];//be columns
		arr[2]=new float[s3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=input.nextFloat();
			}
		System.out.print("Next student iteration");
		}//loop ends
		
		place=arr[0][0];
		minclosest=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				 closest=Math.abs(staff_it-arr[i][j]);//assign closest usins abs (absolute )to not consider negative and positive 
				 if(closest<minclosest)
				 {
					 minclosest=closest;
					 place=arr[i][j];
					 student=i+1;
				 }
				     
				
			}
		}
		
		System.out.println("Iteration "+place+"is closest to Stsff's iteration ");
		System.out.print("The Student is "+student);
	}//psvm ends
}//class ends
		
			