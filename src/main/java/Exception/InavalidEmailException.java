package Exception;

public class InavalidEmailException extends RuntimeException{

    public InavalidEmailException(String message){
        super(message);
    }
}
