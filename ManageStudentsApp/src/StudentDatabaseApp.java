import java.util.*;

public class StudentDatabaseApp {

	public static void main(String[] args) {				
		System.out.println("How many students do you want to enter?: ");
		
		@SuppressWarnings("resource")
		Scanner mine = new Scanner(System.in);
		int studentNumber = mine.nextInt();
		
		Student[] students = new Student[studentNumber];
		
		for (int i = 0; i < studentNumber; i++) {
			students[i] = new Student();
			
			students[i].enroll();
			students[i].payTuition();
			students[i].showInfo();	
		}
				
	}

}
