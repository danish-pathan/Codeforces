import java.util.Scanner;

public class NumberOfPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int numPositions = n - Math.max(a + 1, n - b) + 1;

        System.out.println(numPositions);
    }

}
