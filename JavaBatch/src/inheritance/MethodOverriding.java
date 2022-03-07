package inheritance;

 class  Class7 {

	public void degree() {
		
		String degree = "BA";
		System.out.println(degree);
		
	}
 }
 
 class Class8 extends Class7 {
	 
	 public void degree() {
		 
		 String degree = "BE";
		 System.out.println(degree);
		 
	 }
 
	 
	 
		 
	 
	public static void main(String[] args) {
		
		Class8 obj =new  Class8();
		obj.degree();
		 
		
		
		obj.degree();
		
		

	}

}
