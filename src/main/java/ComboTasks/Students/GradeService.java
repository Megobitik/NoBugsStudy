package ComboTasks.Students;

import java.util.ArrayList;
import java.util.List;

public class GradeService <T extends Number>{

    private final List<StudentsGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentsGrade<T> studentsGrade) throws InvalidGradeException {
        if(studentsGrade == null || studentsGrade.getGrade() == null){
            throw new InvalidGradeException("Оценка не должна быть null");
        }
        if (studentsGrade.getGrade().doubleValue() < 0){
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
        grades.add(studentsGrade);
    }

    public double getAverageBySubject(String subject){
        synchronized (grades){
            return grades.stream().
                    filter(g->g.getSubject().equals(subject))
                    .mapToDouble(g -> g.getGrade().doubleValue())
                    .average().orElse(0.0);
        }
    }
}
