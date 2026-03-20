package Problems;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;

        String aFormatted = String.format("%.2f", a);
        String bFormatted = String.format("%.2f", b);
        if (aFormatted.equals(bFormatted)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
