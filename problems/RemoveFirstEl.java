import java.util.Scanner;

public class RemoveFirstEl {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = removeElement(arr, n);
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(newArr[j] + " ");
        }
    }

    public static int[] removeElement(int[] nums, int n) {
        if (n < 2) {
            return new int[0];
        }
        int[] temp = new int[n - 1];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = nums[i];
        }
        return temp;
    }
}
