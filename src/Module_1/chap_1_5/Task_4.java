package Module_1.chap_1_5;

import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float x = scanner.nextFloat();
        System.out.println(x >= 100 && x <= 999 && x % 5 == 0 ? true : false);
    }
}
