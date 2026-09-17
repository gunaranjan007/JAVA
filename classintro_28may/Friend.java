
class Friend
{
	public void Greetmeet()
   {
	System.out.print("welcome");
   }
    public void Greetgo()
   {
	System.out.print("Bye bye");
   }
   public void Convofrnd()
   {
	int num1=4,num2=6;
	System.out.print("sum "+y_bro(num1,num2));//parameter passing 
   }
   private int y_bro(int numm1,int numm2)//args private
   {
	int result;
	result=numm1+numm2;
	return(result);
   }
}