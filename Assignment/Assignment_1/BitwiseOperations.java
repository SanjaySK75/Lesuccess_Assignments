import java.util.Scanner;
public class BitwiseOperations {
   	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int leftShifta = a << 2;
        int leftShiftb = b << 2;
        int rightShifta = a >> 2;
        int rightShiftb = b >> 2;
        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("XOR: " + xorResult);
        System.out.println("Left Shift num1 by 2: " + leftShifta);
        System.out.println("Left Shift num2 by 2: " + leftShiftb);
        System.out.println("Right Shift num1 by 2: " + rightShifta);
        System.out.println("Right Shift num2 by 2: " + rightShiftb);
    }
}
