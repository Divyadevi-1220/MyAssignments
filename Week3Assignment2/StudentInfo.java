package Week3Assignment2;

public class StudentInfo {
	
	public void getStudentInfo() {
		System.out.println("Students Class -> getStudentInfo Method");
	}
	
	public void getStudentInfo(int id,int phone) {
		System.out.println("Students Class -> id and phone number is : "+id+" "+phone);
	}

		public void getStudentInfo(String name,String dept) {
			System.out.println("Students Class -> name and dept name is : "+name+" "+dept);
}

		public static void main(String[] args) {
			StudentInfo stud1 = new StudentInfo();
			stud1.getStudentInfo();
			stud1.getStudentInfo(278177, 1234567890);
			stud1.getStudentInfo("Divyadevi", "BCA");
		}
}