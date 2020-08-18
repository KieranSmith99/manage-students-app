import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    
    private String courses = "";
    private int year;
    
    private int tuitionBalance;
    private static int courseCost = 600;
    private static int id = 1000;

    public Student() {
        @SuppressWarnings("resource")
		Scanner mine = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        this.firstName = mine.nextLine();
        
        System.out.println("Enter the second name: ");
        this.lastName = mine.nextLine();

        System.out.println("Enter the student's year: ");
        this.year = mine.nextInt();            
        
        setStudentID();               
    }
    
    private void setStudentID() { // Year number + static ID.
    	id++;
    	this.studentID = year + "-" + id;	
    }
    
    public int getStudentYear() {
    	return year;
    }
    
    public void enroll() {
    	
    	@SuppressWarnings("resource")
		Scanner mine = new Scanner(System.in);
    	do {
	    	System.out.print("Enter a course to enroll (Press Q to quit): ");
	    	String course = mine.nextLine();
	    	
	    	if (!course.equals("Q")) {
	    		courses = courses + "\n  " + course;
	    		tuitionBalance += courseCost;
	    	}
	    	
	    	else {	    	
	    		return;
	    	}
	    	
    	} while (1 != 0);    	    	
    }   
    
    public void viewBalance() {
    	System.out.println("Your balance remaining is: "+tuitionBalance);
    }
    
    public void payTuition() {
    	viewBalance();
    	
    	Scanner mine = new Scanner(System.in);
    	System.out.print("How much would you like to pay?: ");
    	int payment = mine.nextInt();
    	
    	tuitionBalance -= payment;
    	System.out.println("Amount paid: "+payment);
    	viewBalance();
    	
    	mine.close();
    }
    
    public void showInfo() {
    	System.out.println("Name: "+firstName+" "+lastName);
    	System.out.println("Year: "+year);
    	System.out.println("ID: "+studentID);
    	System.out.println("Courses enrolled: "+courses);
    	System.out.println("Balance: "+tuitionBalance);
    }
    
}
