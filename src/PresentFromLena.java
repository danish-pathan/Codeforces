import java.util.Scanner;

public class PresentFromLena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < N - i; j++)
                System.out.print("  ");
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (i + j > 0) System.out.print(" ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j);
                if (j > 0) System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N - i; j++)
                System.out.print("  ");
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (i + j > 0) System.out.print(" ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j);
                if (j > 0) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
