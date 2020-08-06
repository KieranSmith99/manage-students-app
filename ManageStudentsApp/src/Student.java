import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String courseName;
    private int year;
    private int courseCost = 600;

    public Student() {
        Scanner mine = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        this.firstName = mine.nextLine();
        
        System.out.println("Enter the second name: ");
        this.lastName = mine.nextLine();

        System.out.println("Enter the student's year: ");
        this.year = mine.nextInt();

    }

    public int getStudentYear() {
        return year;
    }
}
