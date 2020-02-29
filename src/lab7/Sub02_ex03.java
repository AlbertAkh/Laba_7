package lab7;

public class Sub02_ex03 extends Sub01_ex03{
	public String subStr;
	
	Sub02_ex03(int SubInt2, char SubChar2, String subStr2)
	{
		setParams(SubInt2, SubChar2, subStr2);
	}
	
	public void setParams(int SubInt2, char SubChar2, String subStr2)
	{
		this.superInt = SubInt2;
		this.subChar = SubChar2;
		this.subStr = subStr2;
	}
	
	@Override
	public String toString()
	{
		return "Класс "+this.getClass().getSimpleName()+ " содержит поля со значением: "  +
				String.valueOf(superInt) +", " + subChar +", " + subStr ;
	}
}
