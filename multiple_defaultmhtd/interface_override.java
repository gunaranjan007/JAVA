interface sample1
{
	default public void display(String stuName)
	{
		System.out.print("Your name is 1"+stuName);
	}
}
interface sample2
{
	default public void display(String stuName)
	{
		System.out.print("Your name is 2"+stuName);
	}
}
class school implements sample1,sample2
{
	String stuName;
	school(String stuName)
	{
		sample1.super.display(stuName);
		sample2.super.display(stuName);
		this.stuName=stuName;
	}
	
	@Override public void display(String stuName)
	{
		System.out.print("Your name is 3"+stuName);
	}
	
}//class ends
public class interface_override
{
	public static void main(String args[])
	{
		school stu1=new school("guna");
		stu1.display("guna");
	
	}
}
		
		

