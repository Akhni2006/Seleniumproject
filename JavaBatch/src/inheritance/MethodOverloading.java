package inheritance;

public class MethodOverloading {

	int a;
	int b;
	
	public void Sum() {
		
		a=10;
		b=20;
		 
		System.out.println(a+b);
	}
	
	public void Sum(int x,int y) { 
		
	int a=x;
	int b=y;
	
	System.out.println(a+b);
		
	}
	
	public void Sum(int x,double y) {
			
	System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
	
		MethodOverloading MO = new MethodOverloading();
		
		MO.Sum();
		MO.Sum(100,200);
		MO.Sum(10,10.3);

	}

}
