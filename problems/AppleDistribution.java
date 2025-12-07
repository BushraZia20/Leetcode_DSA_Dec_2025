import java.util.Arrays;
import java.util.Scanner;

public class AppleDistribution {
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int n = apple.length, m = capacity.length;
        int totalApples = 0, reqdBoxes = 0;
        for (int i = 0; i < n; i++)
            totalApples += apple[i];
        Arrays.sort(capacity);
        for (int i = m - 1; i >= 0; i--) {
            reqdBoxes++;
            totalApples -= capacity[i];
            if (totalApples <= 0)
                break;
        }
        return reqdBoxes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] apple = new int[n];
        int[] capacity = new int[m];
        for (int i = 0; i < n; i++)
            apple[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            capacity[i] = sc.nextInt();
        sc.close();
        System.out.print(minimumBoxes(apple, capacity));
    }

}
