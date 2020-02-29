package lab7;

public class Sub_ex02 extends Super_ex02 {
	public int subInt;
	
	Sub_ex02(int SubInt, String Str)
	{
		setStr(SubInt, Str);
	}
	@Override
	public void setStr()
	{
		this.subInt = 10;
	}
	
	@Override
	public void setStr(String Str)
	{
		this.subInt = Integer.parseInt(Str);
	}

	public void setStr(int SubInt)
	{
		this.subInt = SubInt;
	}
	
	public void setStr(int SubInt, String Str)
	{
		this.subInt = SubInt+Integer.parseInt(Str);
	}
}
