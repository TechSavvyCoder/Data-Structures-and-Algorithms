package question4;

public class OutgoingCall extends PhoneCall {
	private static final double RATE_PER_MINUTE = 0.04;
    private int minutes;
	
	public OutgoingCall(String phoneNumber, int minutes) {
		super(phoneNumber);
		this.minutes = minutes;
		this.price = RATE_PER_MINUTE * minutes;
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
		System.out.println("Outgoing Call - Phone Number: " + phoneNumber + 
                " | Rate per minute: $" + RATE_PER_MINUTE + 
                " | Minutes: " + minutes + 
                " | Total Price: $" + price);
	}

}
