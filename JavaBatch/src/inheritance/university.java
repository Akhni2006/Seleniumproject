package inheritance;

public class university extends polytechnic implements primary{
	
	public void degree() {
		
		System.out.println("BE");
		System.out.println("toys");
		System.out.println("powernap");
		System.out.println("rhyms");
		System.out.println("addition");
		System.out.println("tamil");
	}

public static void main (String[]args){
	
university education = new university()	;


education.playing();
education.sleeping();
education.alphabets();
education.numbers();
education.mothertongue();
education.degree();
	
	
}


}



