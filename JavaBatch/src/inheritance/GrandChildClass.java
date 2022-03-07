package inheritance;

public class GrandChildClass extends Child1Class {

	
	private void Lefthanded() {
		
	System.out.println("Lefthanded");	
		
	}
	
	private void curlyhair() {
		
		System.out.println("curlyhair");
	}


public static void main (String[] args) {

GrandChildClass  GrandChild = new GrandChildClass();	
	
GrandChild.variableMethod();
GrandChild.displayvariableMethod();

GrandChild.weight=50;
GrandChild.height=5.2f;

GrandChild.chocolates();
GrandChild.Icecreams();

GrandChild.Lefthanded();
GrandChild.curlyhair();

}





}