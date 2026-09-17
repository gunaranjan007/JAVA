interface sample1
{
	default public void display()
	{
		System.out.print("Your name is 1");
	}
}
interface sample2
{
	default public void display()
	{
		System.out.print("Your name is 2");
	}
}
class school implements sample1,sample2
{
	@Override public void display()
	{
		System.out.print("Your name is 3");
		sample1.super.display();
		sample2.super.display();	
	}
	
}//class ends
public class interface_override_outpara
{
	public static void main(String args[])
	{
	
		school stu1=new school();
		stu1.display();
	
	}
}
		
		

