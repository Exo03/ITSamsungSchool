package Module_1.chap_1_9;

import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double a = scanner.nextDouble();
        int b = scanner.nextInt();
        binFraction(a, b);
    }

    public static void binFraction(double x, int n) {
        double t = x - (int) x;
        for (int i = 0; i < n; i++) {
            x *= 2;
            System.out.print((int) x);
            x -= (int) x;
        }
    }
}
