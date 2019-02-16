

import java.util.ArrayList;
import java.util.Scanner;

//import javafx.application.Application;


public class Main  {

	
	public static void main(String[] args) throws Exception {

	//	Application.launch(args);	
    Scanner input=new Scanner(System.in);
    
    
    
    System.out.println("Enter Student ID:");
    String	StudentId=input.nextLine();
	try {
		
		if(StudentId.length()<10) throw new IllegalException("Don't You Know Your ID? Seriously! Try again!");
	}catch(IllegalException e) {
		
		while(StudentId.length()<10) {
			System.out.println(e.getErrormsg());
			StudentId=input.nextLine();
			
		}
	}
		
		
		
	
    System.out.println("Enter Student Name:");
    String	StudentName=input.nextLine();
	try {
		
		if(StudentName.length()>15) throw new IllegalException("Too Long Dear!Sorry! Try again!");
	}catch(IllegalException e) {
		
		while(StudentName.length()>15) {
			System.out.println(e.getErrormsg());
			StudentName=input.nextLine();
			
		}	
	
	}
	
	
	
	
	
	
	 System.out.println("Enter Student Attended?:");
	    int	StudentAttended=input.nextInt();
		try {
			
			if(StudentAttended>24) throw new IllegalException("Attendance can not be more than 24 Dear!");
		}catch(IllegalException e) {
			
			while(StudentAttended>24) {
				System.out.println(e.getErrormsg());
				StudentAttended=input.nextInt();
				
			}	
		
		}
		
	
	
	
	
		
		
		
		
		
		System.out.println("Enter Student Enrollment Year?:");
	    int	StudentEnrollment=input.nextInt();
		try {
			
			if((StudentEnrollment<1994) && (StudentEnrollment>2018)) throw new IllegalException("Unrealistic!");
		}catch(IllegalException e) {
			
			while((StudentEnrollment<1994) && (StudentEnrollment>2018)) {
				System.out.println(e.getErrormsg());
				StudentEnrollment=input.nextInt();
				
			}	
		
		}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
		
  ArrayList<String> N= new ArrayList<>();
  N.add("                                  Welcome To Student Management System                         ");
  System.out.println(N);
  
  for(int i=0;i<101;i++) {
	  System.out.print("_");
  }
  System.out.println();
  
  //System.out.println("__________________________________________________________________________________________");
  Person p2=new Student("Name:","Id:","EnrollmentYear:","Department:",StudentName,StudentId,StudentEnrollment,"ECE",StudentAttended);
  //Person p3=new Student("Name:","Id:","EnrollmentYear:","Department:","Rakibul Hassan",1620587642,2016,"ECE");
  System.out.println(p2.toString());
 // System.out.println("Any Comment on this Software? Good or Bad anything you want! just write below: ");
	
 
  
java.io.File file=new java.io.File("kayser.txt");
if(file.exists()) {
	
	System.out.println("File already exist BRO!");
    System.exit(1);
}
try(java.io.PrintWriter output=new java.io.PrintWriter(file);
		){
	
	output.println(p2);
}

	
	
	
	
	
	
	
	}
  
  
  

	
	
	

}
  
  
  
  
  
  
  
  
  
  
  
  
	
	


