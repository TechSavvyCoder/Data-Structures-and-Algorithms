package question4;

public class PhoneCallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomingCall call1 = new IncomingCall("555-1234");
        OutgoingCall call2 = new OutgoingCall("555-5678", 10);
        
        call1.displayCallInfo();
        call2.displayCallInfo();
        
        System.out.println("\n--- Displaying an Array of Calls ---\n");

        // Part B: Array with a mix of 8 Incoming and Outgoing calls
        PhoneCall[] calls = new PhoneCall[8];
        calls[0] = new IncomingCall("555-1001");
        calls[1] = new OutgoingCall("555-1002", 5);
        calls[2] = new IncomingCall("555-1003");
        calls[3] = new OutgoingCall("555-1004", 7);
        calls[4] = new OutgoingCall("555-1005", 3);
        calls[5] = new IncomingCall("555-1006");
        calls[6] = new OutgoingCall("555-1007", 15);
        calls[7] = new IncomingCall("555-1008");
        
     // Loop through the array and display call details
        for (PhoneCall call : calls) {
            call.displayCallInfo();
        }
	}

}
