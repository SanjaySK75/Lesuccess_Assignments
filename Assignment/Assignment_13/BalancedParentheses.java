import java.util.*;
public class BalancedParentheses {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return "Not Balanced";
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return "Not Balanced";
                }
            }
        }
        return stack.isEmpty() ? "Balanced" : "Not Balanced";
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("((()))")); 
        System.out.println(isBalanced("(()"));    
        System.out.println(isBalanced("{[()]}")); 
        System.out.println(isBalanced("{[(])}")); 
    }
}
