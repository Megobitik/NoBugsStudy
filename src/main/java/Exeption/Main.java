package Exeption;

public class Main {
    static void main(String[] args) {

        ValidationAge validationAge = new ValidationAge();
        try {
            //validationAge.validationAge(500);
            validationAge.validationAge(100);
            //validationAge.validationAge(200);
            //validationAge.validationAge(-100);

        }catch (InvalideAgeException m){
            System.out.println("Ошибка");
        }
    }
}
