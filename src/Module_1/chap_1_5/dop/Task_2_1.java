package Module_1.chap_1_5.dop;

import java.util.Locale;
import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println(y > 0 && y < 0.5 && y < Math.sin(x) && x > 0 && x < Math.PI ? "YES" : "NO");
    }
}
