
public class Student extends Person{
	public String StudentName;
	public String StudentId;
	public int StudentEnrollmentYear;
	public String Department;
	public int StudentAttentded;
	
	
	public Student(String name, String id, String enrollmentYear, String department, String studentName, String studentId,
			int studentEnrollmentYear, String department2,int StudentAttended) {
		super(name, id, enrollmentYear, department);
		StudentName = studentName;
		StudentId = studentId;
		StudentEnrollmentYear = studentEnrollmentYear;
		Department = department2;
	    this.StudentAttentded=StudentAttended;	
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public int getStudentEnrollmentYear() {
		return StudentEnrollmentYear;
	}

	public void setStudentEnrollmentYear(int studentEnrollmentYear) {
		StudentEnrollmentYear = studentEnrollmentYear;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	

	
	public int getStudentAttentded() {
		return StudentAttentded;
	}

	public void setStudentAttentded(int studentAttentded) {
		StudentAttentded = studentAttentded;
	}

	public String attendance() {
		return "Attendence:";
	}
	
	
	public String toString() {
		return super.toString()+StudentName+"             "+StudentId+"              "+StudentEnrollmentYear+"                 "+Department+"         "+StudentAttentded;
	}
	

}
