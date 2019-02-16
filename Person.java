
public class Person implements Attendance {
private String Name;
private String Id;
private String EnrollmentYear;
private String Department;

public Person(String name, String id, String enrollmentYear, String department) {
	Name = name;
	Id = id;
	EnrollmentYear = enrollmentYear;
	Department = department;
}
public String getName(){
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getEnrollmentYear() {
	return EnrollmentYear;
}
public void setEnrollmentYear(String enrollmentYear) {
	EnrollmentYear = enrollmentYear;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String attendance() {
	return "Attendence:";
}

@Override
public String toString() {
	return  Name+"                    "+Id+"             "+EnrollmentYear+"      "+Department+"    "+"   "+attendance()+"\n";
}


}
