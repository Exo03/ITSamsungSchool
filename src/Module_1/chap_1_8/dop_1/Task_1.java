package Module_1.chap_1_8.dop_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            System.out.print(n % 2);
            n /= 2;
        }
    }
}
