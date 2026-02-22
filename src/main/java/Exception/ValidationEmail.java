package Exception;

public class ValidationEmail {

    public static void validEmail(String s){
        if (!s.equals("example@email")){
          throw new InavalidEmailException("не верный mail");
        }
    }

    static void main(String[] args) {
        try {
            validEmail("example@email");
            System.out.println("верный email");
        }
        catch (InavalidEmailException e){
            System.out.println(e);
        }
    }
}
