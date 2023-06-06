import java.util.Scanner;

public class MagicNumbers320A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isMagical = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '4') {
                isMagical = false;
                break;
            }
        }

        if (isMagical && str.charAt(0) != '4' && !str.contains("444")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
