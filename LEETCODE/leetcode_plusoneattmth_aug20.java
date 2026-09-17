class leetcode_plusoneattmth_aug20
{
	public static void main(String args[])
	{
		int[] digits={9,8,7,6,5,4,3,2,1,0};
		int number=0,result=0,count=0,n=0;

    int len=digits.length;//Be a last number of An array
        

     
         for (int i = len - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                break;
            }

            digits[i] = 0;
        }
		for(int ele:digits)
		{
			 System.out.print(ele);
		}
      

    }
}