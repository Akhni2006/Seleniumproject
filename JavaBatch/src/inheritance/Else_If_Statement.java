package inheritance;

public class Else_If_Statement {
 
	static int point=25;
	
	public static void main(String[] args) {
		
	
		
		if(point<=20){
			System.out.println("Eligible for JC");
		}
		else if (point>=20 && point<=30) {
			System.out.println("Eligible for POLY");
			
		}
		else if (point>=30 && point<=40) {
			System.out.println("Eligible for ITE");
		}
		
		else {
			System.out.println("Not eligible for higher education");
			
	}
	}
}
