package Week3Assignment2;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name");
		
	}
	public void studentDept() {
		System.out.println("Student Department");
		
	}
	public void studentId() {
		System.out.println("Student ID");
		
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
			stud.deptName();
			stud.studentDept();
			stud.studentId();
			stud.studentName();
			stud.collegeName();
			stud.collegeCode();
			stud.collegeRank();
		}
		
	}
	


