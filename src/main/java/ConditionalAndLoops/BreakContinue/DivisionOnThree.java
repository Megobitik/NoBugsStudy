package ConditionalAndLoops.BreakContinue;

public class DivisionOnThree {
    public void division(){
        for(int i = 1; i < 20; i++){
            if(i % 3 == 0){
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }

    static void main(String[] args) {
        DivisionOnThree divisionOnThree = new DivisionOnThree();
        divisionOnThree.division();
    }
}
