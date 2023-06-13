import java.util.Arrays;
import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);

        int count = 0;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    count++;
                }
            }
            if (count == 2 && sorted1.equals(sorted2)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
