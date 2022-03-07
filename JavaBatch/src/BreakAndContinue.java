
public class BreakAndContinue {

	public static void main(String[] args) {
	
		for (int i=1; i<=5; i++) {
		System.out.println(i);
		
	for (int a=1; a<=5; a++) {
		if(a==3)continue;
		System.out.println(a);
	}
		}

	


System.out.println("Main method closed");
}
}