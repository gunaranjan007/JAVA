public class jaggedarray_ramana {
    public static void main(String[] args) {
        for(int i = 1 ; i <=5 ; i++)
        {
            char ch = 'B';
            for(int j = 1; j<=5; j++)
            {
                if(i==1 || i== 5)
                {
                    System.out.print(j);
                }
                else if(j==1 )
                {
                    System.out.print("1");
                }
                else if(j==5 )
                {
                    System.out.print("5");
                }
                else if(i==2 && (i+j >=4))
                {
                    System.out.print(ch++);
                }
                else if(i==3 && (i+j >=5))
                {
                    System.out.print(ch++);
                }
                else if(i==4 && (i+j >=6))
                {
                    System.out.print(ch++);
                }
                // else
                // {
                //     System.out.print(" ");
                // }
            }
            System.out.println("");
        }
    }
}