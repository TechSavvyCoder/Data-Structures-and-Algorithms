package question3;

public class GraduateStudent extends Student {
	
	public GraduateStudent(int studentID, String lastName) {
		super(studentID, lastName);
		setTuition();
	}

	@Override
	public void setTuition() {
		// TODO Auto-generated method stub
		annualTuition = 6000 * 2;
	}
	
}
