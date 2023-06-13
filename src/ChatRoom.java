import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        String greeting = "hello";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, b = 0;
        String output = "NO";
        while (b < s.length()) {
            if (s.charAt(b) == greeting.charAt(a)) {
                b++;
                a++;
            } else {
                b++;
            }
            if (a >= greeting.length()) {
                output = "YES";
                break;
            }
        }
        System.out.println(output);
    }
}
