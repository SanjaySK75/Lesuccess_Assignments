import java.util.Scanner;

public class duplicateelement {
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
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No duplicates");
        }
    }
}
