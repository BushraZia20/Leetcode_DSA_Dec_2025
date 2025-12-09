import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = elementOfMaxFreq(arr, n);
        System.out.println(res);
    }

    public static int elementOfMaxFreq(int[] arr, int n) {
        int maxFreq = 0;
        int maxElement = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxFreq || (count == maxFreq && arr[i] > maxElement)) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
