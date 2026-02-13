package Exeption;

public class InavalideEmailException extends RuntimeException{

    public InavalideEmailException(String message){
        super(message);
    }
}
