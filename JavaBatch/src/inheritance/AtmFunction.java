package inheritance;

public class AtmFunction extends AtmDisplay{



	@Override
	public void verifyPIN() {
		
		System.out.println("please enter your SecretPIN");
		
		System.out.println("SecretPIN matched, you can proceed");
			
	}

	@Override
	public void CashWithdraw() {
		System.out.println("please enter amount");
		System.out.println("press enter");
		
	}

	@Override
	public void CashDeposit() {
		System.out.println("please place the cash");
		System.out.println("please press end ");
		
	}

	public static void main(String[]args) {

	AtmFunction IOB = new AtmFunction();
	IOB.welcome();
	IOB.verifyPIN();
	IOB.CashWithdraw();
	IOB.CashDeposit();
	
	
	
	
	
	
	
	

	
	}
}




