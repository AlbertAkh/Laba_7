package lab7;

public class Main_ex02 {

	public static void main(String[] args) {
		Super_ex02 testSuper = new Super_ex02("передано в суперКласс");
		System.out.println("Число символов в поле Суперкласса: "+ testSuper.getStrLength());
		
		Sub_ex02 testSub = new Sub_ex02(14,"5");
		System.out.println("в конструктор субкласса передано: "+ testSub.subInt);
		
	}

}
