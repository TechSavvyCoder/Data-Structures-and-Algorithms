package question4;

public abstract class PhoneCall {
	protected String phoneNumber;
	protected double price;
	
	public PhoneCall(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.price = 0.0;
	}
	
	// Abstract methods
	public abstract String getPhoneNumber();
	public abstract double getPrice();
	public abstract void displayCallInfo();
}
