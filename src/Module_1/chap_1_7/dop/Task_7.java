package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean flg = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                flg = false;
                break;
            }
        }
        if (flg) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
    }
}
