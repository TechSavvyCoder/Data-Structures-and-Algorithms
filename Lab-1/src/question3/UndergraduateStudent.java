package question3;

public class UndergraduateStudent extends Student {
	public UndergraduateStudent(int studentID, String lastName) {
		super(studentID, lastName);
		setTuition();
	}

	@Override
	public void setTuition() {
		// TODO Auto-generated method stub
		annualTuition = 4000 * 2;
	}
}
