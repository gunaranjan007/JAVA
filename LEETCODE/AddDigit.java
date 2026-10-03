class Add {
    public int addDigits(int num) {
    while (num > 9) {
        int ans = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            ans += lastDigit;
            num /= 10;
        }

        num = ans;
    }

    return num;
}
}
public class AddDigit
{
	public static void main(String args[])
	{
		Add addobj=new Add();
		int result=addobj.addDigits(38);
		System.out.print(result);
	}
}