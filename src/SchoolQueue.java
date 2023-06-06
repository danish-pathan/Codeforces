import java.util.Scanner;
public class SchoolQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        while (t > 0) {
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < n - 1; i++) {
                if (str.charAt(i) == 'B' && str.charAt(i + 1) == 'G') {
                    sb.setCharAt(i, 'G');
                    sb.setCharAt(i + 1, 'B');
                    i++;
                }
            }
            str = sb.toString();
            t--;
        }
        System.out.println(str);
    }
}
