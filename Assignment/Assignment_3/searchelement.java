import java.util.Scanner;

public class searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        boolean found = false;
        System.out.println("Enter the Array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element");
        int a = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == a) {
                System.out.println(j);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
