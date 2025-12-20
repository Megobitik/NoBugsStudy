package Objects;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String anyGroupName, int anyStudentCount){
        this.groupName = anyGroupName;
        this.studentCount = anyStudentCount;
    }

    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    void setStudentCount(int newSudentCount){
        this.studentCount = newSudentCount;
    }

    public void printinfo(){
        System.out.println("groupName: "+ groupName + " studentCount " + studentCount);
    }
}
