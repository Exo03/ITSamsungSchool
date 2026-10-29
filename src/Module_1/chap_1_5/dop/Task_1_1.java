package Module_1.chap_1_5.dop;

import java.util.Locale;
import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println(y < x && x*x + y*y > 4 && x < 2 && y > 0 ? "YES" : "NO");
    }
}
