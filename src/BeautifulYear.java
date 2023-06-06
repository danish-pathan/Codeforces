import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int cur = y + 1;
        while (cur > 0) {
            HashSet<Integer>digits = new HashSet<>();
            boolean rep = false;
            for (int i = cur; i > 0; i /= 10) {
                int digit = i % 10;
                if (digits.contains(digit)) {
                    rep = true;
                    break;
                } else {
                    digits.add(digit);
                }
            }
            if (!rep) {
                System.out.println(cur);
                break;
            }
            cur++;
        }
    }
}
