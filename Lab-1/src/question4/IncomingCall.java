package question4;

public class IncomingCall extends PhoneCall{
	private static final double RATE = 0.02;
	
	public IncomingCall(String phoneNumber) {
		super(phoneNumber);
		this.price = RATE;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void displayCallInfo() {
		// TODO Auto-generated method stub
		System.out.println("Incoming Call - Phone Number: " + phoneNumber + 
                " | Rate: $" + RATE + " | Total Price: $" + price);
    }

}
