package Module_1.chap_1_6;

import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        if (a == 0 && b <= 0 || a < 0 && b < 0) {
            System.out.println("no such x");
        } else if (b > 0 && a > 0 || a == 0 && b > 0) {
            System.out.println("any x");
        } else if (a > 0) {
            float l = b / a, r = -b / a;
            System.out.print("x<");
            System.out.printf(Locale.US, "%.1f", l);
            System.out.print(" or x>");
            System.out.printf(Locale.US, "%.1f", r);
        } else {
            float l = b / a, r = -b / a;
            System.out.printf(Locale.US, "%.1f", l);
            System.out.print("<x<");
            System.out.printf(Locale.US, "%.1f", r);
        }
    }
}
