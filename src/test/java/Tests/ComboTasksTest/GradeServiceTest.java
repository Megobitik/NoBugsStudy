package Tests.ComboTasksTest;

import ComboTasks.Students.GradeService;
import ComboTasks.Students.InvalidGradeException;
import ComboTasks.Students.StudentsGrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    GradeService<Integer> service;

    @BeforeEach
    void setUp(){
        service = new GradeService<>();
    }

    @Test
    public void checkValidationGrade(){
        StudentsGrade<Integer> studentsGrade = new StudentsGrade<>("Alex","Math",3);
        assertDoesNotThrow(() -> service.addGrade(studentsGrade));

    }

    @Test
    public void checkWithMinusGrade(){
        StudentsGrade<Integer> studentsGrade = new StudentsGrade<>("Alex","Math",-3);
        assertThrows(InvalidGradeException.class,() -> service.addGrade(studentsGrade));
    }

    @Test
    public void checkAverage() throws InvalidGradeException {
        service.addGrade(new StudentsGrade<>("Alex","Math",4));
        service.addGrade(new StudentsGrade<>("Alex","Math",5));

        double avg = service.getAverageBySubject("Math");

        assertEquals(4.5,avg);
    }

    @Test
    public void checkAverageWithOutGrade(){
        double avg = service.getAverageBySubject("eng");
        assertEquals(0.0,avg);
    }
}
