package lab7;

public class Ex04_Sub2 extends Ex04_Sub1 {
	public int subInt;
	
	Ex04_Sub2()
	{
		
	}
	
	Ex04_Sub2(char Ch, String Str, int SubInt)
	{
		this.ch = Ch;
		this.str = Str;
		this.subInt = SubInt;
	}
	
	Ex04_Sub2(Ex04_Sub2 testSub2)
	{
		this(testSub2.ch, testSub2.str, testSub2.subInt);
		
	}
	
	@Override
	public void getParams()
	{
		System.out.println(this.ch +" "+ this.str+" ,"+ this.subInt);
	}
}
