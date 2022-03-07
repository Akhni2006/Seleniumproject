package inheritance;

public class Popular {
int x=10;
double y=10.0;
	public Popular() {
		
		System.out.println("Books");
	}
		public Popular(int x){
			System.out.println("10+Books");
			
	}
		
		public Popular(double y) {
			System.out.println("10.0 Books");
		}
	public static void main(String[] args) {
		
		Popular p1 = new Popular();
		Popular p2 = new Popular(10);
		Popular p3 = new Popular(10.0);
		

	}

}
