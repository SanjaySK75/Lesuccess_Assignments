import java.util.Scanner;

public class Type_conversion {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter an Integer Value :");
                int a = sc.nextInt();
                System.out.print("Enter an Floating Value :");
                float b = sc.nextFloat();
                System.out.print("Enter an Character Value :");
                char c = sc.next().charAt(0);
                b += Float.valueOf(a);
                a += (int) c;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
        }
}
