package Collections.Origin;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTask {

    public static Boolean valid(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for(Character c: s.toCharArray()){
            if (c == '(' || c =='{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty())
                    return false;
                    char top = stack.pop();

                if(!match(top,c)) return false;
            }
        }
        return stack.isEmpty();
    }
    private static boolean match (char open, char closed){
        return (open == '(' && closed == ')') || (open == '{' && closed == '}') || (open == '[' && closed == ']');
    }

    static void main(String args[]) {
        System.out.println(valid("(){}[]"));
        System.out.println(valid("()}"));
    }
}
