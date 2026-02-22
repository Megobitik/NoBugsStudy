package Exception;

public class ValidationAge{

    public void validationAge(int age) throws InvalidAgeException{
        if (age < 0 || age > 150){
            throw new InvalidAgeException(age + "Не корректный вораст");
        }
        else {
            System.out.println("Возраст корректен");
        }
    }

}
