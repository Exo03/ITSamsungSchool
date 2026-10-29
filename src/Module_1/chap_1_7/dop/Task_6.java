package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean flg = false;
        do {
            if (x % 10 == x / 10 % 10) {
                flg = true;
                break;
            }
            x /= 10;
        } while (x / 10 > 0);
        if (flg) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
