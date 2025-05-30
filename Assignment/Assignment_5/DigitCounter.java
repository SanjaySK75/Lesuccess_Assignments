import java.util.Scanner;

public class DigitCounter {
    public static int countDigits(int num) {
        if (num == 0) return 0;
        return 1 + countDigits(num / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits = (number == 0) ? 1 : countDigits(number);
        System.out.println("The number of digits in " + number + " is " + digits);
    }
}
