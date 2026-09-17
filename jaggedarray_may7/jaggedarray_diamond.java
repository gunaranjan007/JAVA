public class jaggedarray_diamond {
    public static void main(String[] args) {
        for (int i =0; i<=6; i++)
	    {
	        for (int j = 0; j<=6 ;j++)
	        {
	            if((i+j==3) || (i-j==3) || (j-i==3) ||(i+j == 9))
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println("");
	    }
    }
}