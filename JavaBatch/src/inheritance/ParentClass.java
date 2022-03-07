package inheritance;


public class ParentClass {

	int weight=50;
	int age=45;
	String dress="Saree";
	String vehicle="Car";
	
	
	protected int methodA() {
	System.out.println("age of the person= "+age);
	System.out.println("weight of the person="+weight);
	return 55;
	

	}

	protected String methodB() {
		
	System.out.println("dress of the person=" + dress);
	System.out.println("vehicle of the person=" + vehicle);
	return "mother";
	
	}
	public static void main(String[] args) {
	
	
	ParentClass parent = new ParentClass();
System.out.println(parent.methodA());
System.out.println(parent.methodB());
	}

}
