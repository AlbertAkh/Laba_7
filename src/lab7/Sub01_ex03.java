package lab7;

public class Sub01_ex03 extends  Super_ex03{
	public char subChar;
	
	Sub01_ex03()
	{
	}
	
	Sub01_ex03(int SubInt, char SubChar)
	{
		setParams(SubInt, SubChar);
	}
	public void setParams(int SubInt, char SubChar)
	{
		this.superInt = SubInt;
		this.subChar = SubChar;
	}
	
	@Override
	public String toString()
	{
		return "Класс "+this.getClass().getSimpleName()+ " содержит поля со значением: "  +
				String.valueOf(superInt) +", " + subChar ;
	}
}
