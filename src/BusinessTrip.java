import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int sum = 0;
        int i = 0;
        for (i = 11; i >= 0 && sum < k; i--) {
            sum += a[i];
        }
        if (sum < k) {
            System.out.println("-1");
        } else {
            System.out.println(11 - i);
        }
    }
}
