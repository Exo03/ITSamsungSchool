package Module_1.chap_1_6.dop;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 1 || x > 12) {
            System.out.println(0);
            return;
        }
        if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
            System.out.println(31);
        } else if (x == 2) {
            System.out.println(28);
        } else {
            System.out.println(30);
        }
    }
}
