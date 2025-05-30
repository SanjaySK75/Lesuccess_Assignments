import java.util.Scanner;

public class RecursivePalindrome {
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println(result ? "Yes" : "No");
    }
}
