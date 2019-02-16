
public class Faculty extends Person {

	public String FacultyName;
	public String FacultyId;
	public int FacultyEnrollmentYear;
	public String Department;
	public int FacultyAttentded;
	
	
	public Faculty(String name, String id, String enrollmentYear, String department, String facultyName,
			String facultyId, int facultyEnrollmentYear, String department2, int facultyAttentded) {
		super(name, id, enrollmentYear, department);
		FacultyName = facultyName;
		FacultyId = facultyId;
		FacultyEnrollmentYear = facultyEnrollmentYear;
		Department = department2;
		FacultyAttentded = facultyAttentded;
	}


	public String getFacultyName() {
		return FacultyName;
	}


	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}


	public String getFacultyId() {
		return FacultyId;
	}


	public void setFacultyId(String facultyId) {
		FacultyId = facultyId;
	}


	public int getFacultyEnrollmentYear() {
		return FacultyEnrollmentYear;
	}


	public void setFacultyEnrollmentYear(int facultyEnrollmentYear) {
		FacultyEnrollmentYear = facultyEnrollmentYear;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public int getFacultyAttentded() {
		return FacultyAttentded;
	}


	public void setFacultyAttentded(int facultyAttentded) {
		FacultyAttentded = facultyAttentded;
	}


	@Override
	public String toString() {
		return super.toString()+FacultyName + "     " + FacultyId + "    "
				+ FacultyEnrollmentYear + "       " + Department + "        " + FacultyAttentded;
	}



}
