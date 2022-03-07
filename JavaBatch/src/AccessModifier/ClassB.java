package AccessModifier;

public class ClassB {

	int i=30;
	void m1() {
		
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
	
		ClassB bobj=new ClassB();
		ClassC cobj=new ClassC();
		
		bobj.m1();
		cobj.m2();

	}

}

