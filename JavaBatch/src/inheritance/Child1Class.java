package inheritance;

public class Child1Class extends ParentClass {

	int weight=40;
	int age=20;
	String dress="kurti";
	String vehicle="Bike";
	

	
protected int methodA() {	

System.out.println("weight of the person="+weight);	
System.out.println("age of the person="+age);
return 25;
	
	
}
	
protected String methodB() {
	
System.out.println("dress of the person="+dress);
System.out.println("vehicle of the person="+vehicle);
return "daughter";

	
}	
	public static void main(String[] args) {
	
		
		Child1Class child =new Child1Class();
		
	System.out.println(child.methodA());
	System.out.println(child.methodB());
	
	
	
	
	
	
	
	
		
		

	}

}
