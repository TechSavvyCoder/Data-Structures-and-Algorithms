package question3;

public class StudentAtLarge extends Student {
	
	public StudentAtLarge(int studentID, String lastName) {
		super(studentID, lastName);
		setTuition();
	}

	@Override
	public void setTuition() {
		// TODO Auto-generated method stub
		annualTuition = 2000 * 2;
	}

}
