import java.util.Arrays;
import java.util.Scanner;

public class Sale34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sumMoney = 0;
        for (int i = 0; i < m; i++) {
            if (arr[i] < 0) {
                sumMoney -= arr[i];
            } else {
                break;
            }
        }
        System.out.println(sumMoney);
    }
}
