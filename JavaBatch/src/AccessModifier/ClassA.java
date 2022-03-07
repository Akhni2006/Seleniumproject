
package AccessModifier;

public class ClassA {

	public String city="chennai";
	public void method() {
		
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		ClassA CA = new ClassA();
		CA.method();

	}

}
