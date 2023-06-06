import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elephant205A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long smallest = arr[0];
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                list.clear();
                list.add(i);
            } else if (arr[i] == smallest) {
                list.add(i);
            }
        }
        if (n == 1) {
            System.out.println("1");
        } else if (list.size() > 1) {
            System.out.println("Still Rozdil");
        } else {
            int idx = list.get(0);
            System.out.println(idx + 1);
        }
    }
}
