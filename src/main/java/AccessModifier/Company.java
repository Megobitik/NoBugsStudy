package AccessModifier;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    static {
        companyName = "noBugs";
    }

    Company(int someEmployeeID, String someEmployeeName){
        this.employeeName = someEmployeeName;
        this.employeeID = someEmployeeID;
    }

     String getEmployeeName(){
        return this.employeeName;
     }

     void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
     }

     public static void printCompanyName(){
        System.out.println(companyName);
     }
}


