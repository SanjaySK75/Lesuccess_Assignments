import java.util.Scanner;
public class ArithmeticOperations {
   	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter a double value: ");
        double c = scanner.nextDouble();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = 0;
        if (b != 0) {
            division = (double) a / b;
        } else {
            System.out.println("Cannot divide by zero.");
        }
        double result = addition * c;
        System.out.println("Addition of integers: " + addition);
        System.out.println("Subtraction of integers: " + subtraction);
        System.out.println("Multiplication of integers: " + multiplication);
        if (b != 0) {
            System.out.println("Division of integers: " + division);
        }
        System.out.println("Addition result multiplied by double value: " + result);
    }
}
