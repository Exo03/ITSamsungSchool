package Module_1.chap_1_5;

import java.util.Locale;
import java.util.Scanner;

public class Task_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println((y > 2*x*x && y > 1 - x && x < 1) || (y < 2*x*x && x < 1 && y > 1 - x && x > 0) ? "YES" : "NO");
    }
}
