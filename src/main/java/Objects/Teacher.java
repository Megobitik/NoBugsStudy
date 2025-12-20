package Objects;

public class Teacher {
    String name;
    String subject;

    Teacher(String anyName, String anySubject){
        this.name = anyName;
        this.subject = anySubject;
    }

    String getName(){
        return this.name;
    }
    String getSubject(){
        return this.subject;
    }

    void setName(String newName){
        this.name = newName;
    }
    void setSubject(String newSubject){
        this.subject = newSubject;
    }
    public void printInfo(){
        System.out.println("Name: "+ name + " subject: "+ subject);
    }
}
