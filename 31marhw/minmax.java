import java.util.Scanner;
class minmax
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		int num_1=0,i=1,num_2=0,min=0,max=0,num=0;

		System.out.print("Enter number:");
		num_1=input.nextInt();
		max=num_1;
		min=num_1;
		
		while(i<5)
		{
			System.out.print("Enter number:");
			num=input.nextInt();
				if(max>num)
					min=num;
				else
				{
					min=max;
				    max=num;
				}
				if(min>num)
					min=num;
				if(max<num)
					max=num;
			
				
				
			
		 i+=1;
		}
		
			
		
		System.out.println(min);
		System.out.print(max);
        
      		
	
	}
	
		
}

		
		