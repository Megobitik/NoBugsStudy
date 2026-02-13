package Exeption;

public class ValidationAge{

    public void validationAge(int age) throws InvalideAgeException{
        if (age < 0 || age > 150){
            throw new InvalideAgeException(age + "Не корректный вораст");
        }
        else {
            System.out.println("Возраст корректен");
        }
    }

}
