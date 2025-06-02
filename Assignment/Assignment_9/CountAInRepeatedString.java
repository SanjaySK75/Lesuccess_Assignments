import java.util.Scanner;
public class CountAInRepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long fullRepeats = n / s.length();
        long remainder = n % s.length();
        long countInFull = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') countInFull++;
        }
        long totalCount = countInFull * fullRepeats;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') totalCount++;
        }
        System.out.println(totalCount);
    }
}