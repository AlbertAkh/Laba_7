package lab7;

public class Ex04_Sub1 extends Ex04_Super {
	public String str;
	
	Ex04_Sub1()
	{
		
	}
	
	Ex04_Sub1(char Ch, String Str)
	{
		this.ch = Ch;
		this.str = Str;
	}
	
	Ex04_Sub1(Ex04_Sub1 testSub1)
	{
		this(testSub1.ch, testSub1.str);
		
	}
	
	@Override
	public void getParams()
	{
		System.out.println(this.ch +" "+ this.str);
	}
}
