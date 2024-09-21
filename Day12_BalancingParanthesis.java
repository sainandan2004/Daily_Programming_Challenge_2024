import java.util.Stack;

public class Day12_BalancingParanthesis {
    public static boolean ispar(String s) {  
        Stack<Character> dee = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
          
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                dee.push(s.charAt(i)); 
            } 
            else {
              
                // If it's a closing bracket, check if the stack is non-empty
                // and if the top of the stack is a matching opening bracket
                if (!dee.empty() && 
                    ((dee.peek() == '(' && s.charAt(i) == ')') ||
                     (dee.peek() == '{' && s.charAt(i) == '}') ||
                     (dee.peek() == '[' && s.charAt(i) == ']'))) {
                    dee.pop(); 
                }
                else {
                    return false;
                }
            }
        }
        return dee.empty();
    }

    public static void main(String[] args) {
        String s = "{()}[]";
        if (ispar(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
