import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Interest Type:");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        System.out.print("Enter Principal (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (R): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (T) in years: ");
        double time = scanner.nextDouble();
        double interest;
        if (choice == 1) {
            interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + interest);
        } else if (choice == 2) {
            interest = principal * Math.pow((1 + rate / 100), time) - principal;
            System.out.println("Compound Interest = " + interest);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
