import java.util.Scanner;
interface MountainArray {
    int get(int index);
    int length();
}
class MountainArrayImpl implements MountainArray {
    private int[] arr;
    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }
    public int get(int index) {
        return arr[index];
    }
    public int length() {
        return arr.length;
    }
}
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, 0, n - 1);
        int index = binarySearch(mountainArr, 0, peak, target, true);
        if (index != -1) return index;
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);
    }
    private int findPeak(MountainArray arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } 
            else {
                high = mid;
            }
        }
        return low;
    }
    private int binarySearch(MountainArray arr, int low, int high, int target, boolean asc) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            if (asc) {
                if (target < val) high = mid - 1;
                else low = mid + 1;
            } 
            else {
                if (target < val) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
public class MountainArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of mountain array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the mountain array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        MountainArray mountainArr = new MountainArrayImpl(arr);
        Solution sol = new Solution();
        int result = sol.findInMountainArray(target, mountainArr);
        if(result != -1){
            System.out.println("Target found at index: " + result);
        } 
        else {
            System.out.println("Target not found in the mountain array.");
        }
        scanner.close();
    }
}
