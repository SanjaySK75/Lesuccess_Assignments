import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k Value : ");
        int k = sc.nextInt();
    }
}