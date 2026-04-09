package ComboTasks.Validation;

import java.util.regex.Pattern;

public class UserValidator {
    private boolean validation = true;

    private final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public void setValidation(boolean enable){
        validation = enable;
    }

    private void validateName(String name) throws InvalidUserException{
        if (name == null || name.isEmpty()){
            throw new InvalidUserException("пустое значение в поле Имя");
        }
        if (name.charAt(0) != Character.toUpperCase(name.charAt(0))){
            throw new InvalidUserException("Имя должно быть с заглавной буквы");
        };
    }

    private void validateAge(int age) throws InvalidUserException{
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть от 18 до 100");
        }
    }

    private void validateEmail(String email) throws InvalidUserException{
        if(email == null || !EMAIL_PATTERN.matcher(email).matches()){
            throw new InvalidUserException("Не корректный email");
        }
    }

    public void validate(User user) throws InvalidUserException{
        if (!validation){
            return;
        }
        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }
}
