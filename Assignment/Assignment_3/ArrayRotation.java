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
        rotate(arr, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void rotate(int[] arr,int k){
        reverse(arr , 0 , k-1);
        reverse(arr , k , arr.length-1);
        reverse(arr , 0 , arr.length-1);
    }
    static void reverse(int[] arr,int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}