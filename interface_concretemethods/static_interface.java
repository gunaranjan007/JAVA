interface student
{
	static public void Student_admission(String stuName)
	{
		System.out.print("STUDENT "+stuName+"will get admission");
	}
}
class school implements Student_admission
{
	Strint stuName;
	school(String stuName)
	{
		this.stuName=stuName;
	}
	Student_admission(stuName);
}
public class static_interface
{
	public static void main(String args[])
	{
		school stu1=new school("guna");
	}
	
}
		
	