class T1 extends RuntimeException
{
	T1(String s)
	{
		super(s);
	}
}

class T2 extends RuntimeException
{
	T2(String s)
	{
		super(s);
	}
}
public class Exp7 {

	public static void main(String[] args) {
		int age = 42;
		if(age<18)
				{
			throw new T1("not eligible");
				}
		else if(age>60)
		{
			throw new T2("Expired");
		}
		else 
			System.out.println("Eligible");

	}

}
