package inheritance;

public class Child2Class extends ParentClass{ 



private void Books() {
	
	System.out.println("Books");
}

private void Fruits( ) {

System.out.println("Fruits");	
		
}

public static void main(String[] args) {
	
Child2Class Child2 = new Child2Class();

Child2.variableMethod();
Child2.displayvariableMethod();

Child2.weight=50;
Child2.height=5.2f;

Child2.Books();
Child2.Fruits();












}

}