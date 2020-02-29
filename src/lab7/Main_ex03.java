package lab7;

public class Main_ex03 {

	public static void main(String[] args) {
		Super_ex03 testSuper = new Super_ex03(4);
		System.out.println(testSuper.toString());

		Sub01_ex03 testSub1 = new Sub01_ex03(6, 'a');
		System.out.println(testSub1.toString());
		
		Sub02_ex03 testSub2 = new Sub02_ex03(8, 'a', "тест2");
		System.out.println(testSub2.toString());
	}

}
