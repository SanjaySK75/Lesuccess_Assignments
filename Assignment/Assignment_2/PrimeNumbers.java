import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
