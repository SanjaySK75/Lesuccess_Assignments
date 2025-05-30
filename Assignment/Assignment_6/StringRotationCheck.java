import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("False");
        } else {
            String combined = s1 + s1;
            System.out.println(combined.contains(s2));
        }
    }
}
