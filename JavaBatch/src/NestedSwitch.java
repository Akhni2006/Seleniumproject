
public class NestedSwitch {

	public static void main(String[] args) {
		
		int fruit=3;
		String colour="red";
		
		switch (fruit) {
		
		case 1:
			System.out.println("It contains vitamin C");
		break;
		case 2:
			System.out.println("It contains vitamin A");
		break;
		case 3:
			System.out.println("It contains vitamin B");
			
			switch (colour) {
			
			case "orange":
				System.out.println("The fruit is orange");
				break;
				
			case "yellow":
				System.out.println("The fruit is Banana");
				break;
				
			case "red":
				System.out.println("The fruit is Apple");
				break;
				default:
					System.out.println("enter a valid fruit");
				
			
			
		
		}
		}

	}

}
