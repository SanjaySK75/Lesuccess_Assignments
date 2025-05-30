import java.util.Scanner;

public class CharCounter {
    public static int countChar(String str, char ch, int index) {
        if (index >= str.length()) return 0;
        int count = (str.charAt(index) == ch) ? 1 : 0;
        return count + countChar(str, ch, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.next().charAt(0);
        int result = countChar(input, ch, 0);
        System.out.println(result);
    }
}
