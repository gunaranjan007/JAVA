class leetcode_plusone_aug20
{
	public static void main(String args[])
	{
		int[] digits={9,8,7,6,5,4,3,2,1,0};
		int number=0,result=0,count=0,n=0;

    int len=digits.length;//Be a last number of An array
        
 
        for(int i=0;i<len;i++)//Traverse through the integer Array
        {
             number=number*10+digits[i];
        }
        result= number+1;
        int answer=result;

        while(result!=0)
        {
            n=result%10;
            count++; //Getting how many numbers

        result/=10;
        }

        int[] Digits =new int[count];
    
           for(int i=count-1;i>=0;i--)
           {
                Digits[i]=answer%10;
            answer/=10; 
           }
           //iteration
        
		for(int ele:Digits)
		{
			 System.out.print(ele);
		}
        System.out.println(number);
		System.out.println(result);
		System.out.println(answer);
        

    }
}