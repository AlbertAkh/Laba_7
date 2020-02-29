package lab7;

public class Super_ex03 {
	public int superInt ;
	
	Super_ex03 ()
	{

	}
	
	Super_ex03 (int SuperInt)
	{
		setParams(SuperInt);
	}
	
	public void setParams(int SuperInt)
	{
		this.superInt = SuperInt;
	}
	
	@Override
	public String toString()
	{
		return "Класс "+this.getClass().getSimpleName()+ " содержит поля со значением: "  +
				String.valueOf(superInt);
	}
		
}
