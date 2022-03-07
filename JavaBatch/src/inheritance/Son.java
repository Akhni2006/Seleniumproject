package inheritance;

public class Son extends Father {
	
	public void degree() {
		
		String degree = "Son class - BE";
		System.out.println(degree);
		
		
		
	}

	public static void main(String[] args) {
		
Son sobj = new Son();
sobj.degree();
Father fobj = new Father();
fobj.degree();




	}

}
