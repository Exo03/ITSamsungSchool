package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        long n = scanner.nextLong();
        System.out.println(binp(a, n));
    }

    public static double binp(double a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            double r = binp(a, n / 2);
            return r * r;
        } else {
            return a * binp(a, n - 1);
        }
    }
}
