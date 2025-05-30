import java.util.Scanner;

public class PowerCalculator {
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = power(base, exponent);
        System.out.println(result);
    }
}
