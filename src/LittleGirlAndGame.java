import java.util.Scanner;

public class LittleGirlAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int oddLetters = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                oddLetters++;
            }
        }

        if (oddLetters == 0 || oddLetters % 2 == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }

    }
}
