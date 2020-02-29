package lab7;

public class Main_ex01 {

	public static void main(String[] args) {
		lab7_ex_01 superClassObject = new lab7_ex_01("передал в конструктор суперкласса");
		String className = superClassObject.toString(); 
		System.out.println(className); 
		
		lab7_Sub_ex_01 subClassObject1 = new lab7_Sub_ex_01("передал в конструктор подкласса"); 
		String subClassName = subClassObject1.toString();
		System.out.println(subClassName); 
		
		lab7_Sub_ex_01 subClassObject2 = new lab7_Sub_ex_01("передал в конструктор подкласса", "где два параметра"); 
		String subClassName2 = subClassObject2.toString(); System.out.println(subClassName2);

	}

}
