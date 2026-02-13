package Exeption;

public class ValidationEmail {

    public static void validEmail(String s){
        if (s != "example@email"){
          throw new InavalideEmailException("не верный mail");
        }
    }

    static void main(String[] args) {
        validEmail("newEmail");
    }
}
