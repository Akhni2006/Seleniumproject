package Loops;

public class Array {

	public static void main(String[] args) {
	
		int nVariable=5;
		long[]  regNo= {200,201,202,203,204,};
		
		System.out.println("Normal Variable = "+ nVariable);
		System.out.println("Array Variable =" + regNo);
		System.out.println("print using index " + regNo[2]);
		
		for (long i : regNo) {
			System.out.println(i);
			
			long[] sNo= {200,201,202,203,204,};
			
			System.out.println(regNo.hashCode());
			
			System.out.println(sNo.length);
			System.out.println(regNo.length);
			System.out.println(regNo.());
		
		}
	}

}
