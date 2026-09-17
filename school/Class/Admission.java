package Class;
public class Admission
{
	public static String markEligible(int mark)//packages methood are should be static 
	{
	String result;
		if(mark>65)
		  result="Eligible";
	    else
			result="Not Eligible";
	return(result);
	}
	public static String ageEligible(int age)//packages methood are should be static 
	{
	String result;
		if(age>10)
		  result="Eligible";
	    else
			result="Not Eligible";
	return(result);
	}
	public static String genderEligible(int gender)//packages methood are should be static 
	{
		String result;
		if(gender>10)
		  result="Eligible";
	    else
			result="Not Eligible";
	return(result);
	}
	

	
}
			