import java.util.Scanner;

//Approach - 1:
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean wordAppended = false;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i) == 'W' && s.charAt(i + 1) == 'U' && s.charAt(i + 2) == 'B') {
                i += 2;
                if (wordAppended) {
                    sb.append(" ");
                    wordAppended = false;
                }
            } else {
                sb.append(s.charAt(i));
                wordAppended = true;
            }
        }
        System.out.println(sb.toString());
    }
}

//Approach - 2
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("WUB", " ");
        s = s.trim();
        String ans = s.replaceAll("\\s+", " ");
        System.out.println(ans);
    }
}

