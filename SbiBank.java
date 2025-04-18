package Practice_set_1804;

public class SbiBank implements Bank{

	@Override
	public void makePayment() {
		
		System.out.println("Sbi bank payment.....");
		
	}
	
	public static void main(String[] args) {
		SbiBank sb = new SbiBank();
		sb.makePayment();
	}

	
	
}
