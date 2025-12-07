import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] candles = new int[n];
            for (int i = 0; i < n; i++) {
                candles[i] = sc.nextInt();
            }
            int res = tallestCandle(candles, n);
            System.out.println(res);
        }
    }

    public static int tallestCandle(int[] arr, int n) {
        int tallest = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > tallest) {
                tallest = arr[i];
            } else if (arr[i] == tallest) {
                count++;
            }
        }
        return count;
    }
}

/*
 * LOGIC
 * 
 * 1. Read n (number of candles)
 * 2. Read the list of candle heights
 * 3. Find the tallest candle height (max)
 * 4. Initialize count = 0
 * 5. For each candle in the list:
 * if candle == max height:
 * count++
 * 6. Print count
 */