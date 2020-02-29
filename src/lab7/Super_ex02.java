package lab7;

public class Super_ex02 {
	private String str;
	private int strLength;

	Super_ex02(String str)
	{
		setStr(str);
	}
	
	Super_ex02()
	{

	}
	

	public String getStr() {
		return str;
	}

	public void setStr(String Str) {
		this.str = Str;
	}
	
	public void setStr()
	{
		this.str = "Поле, получившиеся сеттером без параметров";
	}


	public int getStrLength() {
		return strLength=str.length();
	}
}
