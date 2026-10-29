package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int cnt = 0;
        for (int i = 10000; i < 100000; i++) {
            if (i % a == b && i % c == d) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println(-1);
        }
    }
}
