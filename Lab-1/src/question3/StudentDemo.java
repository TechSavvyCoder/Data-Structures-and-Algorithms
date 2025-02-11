package question3;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[6];
		
		students[0] = new UndergraduateStudent(101, "Smith");
        students[1] = new GraduateStudent(102, "Johnson");
        students[2] = new StudentAtLarge(103, "Williams");
        students[3] = new UndergraduateStudent(104, "Brown");
        students[4] = new GraduateStudent(105, "Jones");
        students[5] = new StudentAtLarge(106, "Davis");
        
        System.out.println("Parker University Student List");
        for(Student student : students) {
        	student.display();
        }
	}

}
