package AccessModifier;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }
    static void changeUniversityName(String newName){
        universityName = newName;
    }
    String getStudentName(){
        return this.studentName;
    }
    public void printStudentInfo(){
        System.out.println("Имя " + this.studentName + " ИД " + this.studentID + " университет " + universityName);
    }

}
