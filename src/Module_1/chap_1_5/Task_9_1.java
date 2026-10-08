package Module_1.chap_1_5;

import java.util.Locale;
import java.util.Scanner;

public class Task_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println(y < 1 && x < 1 && ((x*x + y*y < 1) || (x > 0 && y > 0)) ? "YES" : "NO");
    }
}
