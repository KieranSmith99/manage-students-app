import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void testStudentYear() {
		Student myStudent = new Student();
		
		int testYear = myStudent.getStudentYear();
		
		assertEquals(testYear, 3);
	}

}
