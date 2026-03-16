package Tests;

public class ValidPhoneNumber {
    public boolean isValidPhoneNumber(String phone) {
        if(phone == null){
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

}
