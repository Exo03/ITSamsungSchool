package Module_1.nested_loops;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean flg = false;
        outer:
        for (int i = a; i <= b; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
            flg = true;
        }
        if (!flg) {
            System.out.println(0);
        }
    }
}
