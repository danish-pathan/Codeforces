import java.util.Arrays;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        int planes = sc.nextInt();
        int[] seats = new int[planes];

        for (int i = 0; i < planes; i++) {
            seats[i] = sc.nextInt();
        }

        Arrays.sort(seats);
        int remaining = pass;
        int minProfit = 0;
        int maxProfit = 0;

        for (int i = 0; i < planes; i++) {
            int a;
            if (seats[i] <= remaining) {
                a = 0;
            } else {
                a = seats[i] - remaining;
            }
            int b = seats[i];
            minProfit += (b + a + 1) * (b - a) / 2;
            remaining -= (b - a);
            if (remaining <= 0) {
                break;
            }
        }

        remaining = pass;
        int[] frequency = new int[seats[planes - 1] + 1];
        for (int i = 1; i <= seats[planes - 1]; i++) {
            frequency[i] = 0;
        }

        for (int p = 0; p < planes; p++) {
            for (int q = 0; q <= seats[p]; q++) {
                ++frequency[q];
            }
        }

        for (int i = seats[planes - 1]; i > 0; i--) {
            int c = Math.min(frequency[i], remaining);
            maxProfit += i * c;
            remaining -= c;
            if (remaining <= 0) {
                break;
            }
        }
        System.out.println(maxProfit + " " + minProfit);
    }
}
