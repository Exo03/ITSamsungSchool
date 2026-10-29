package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(cnt + " ");
            cnt += 2;
        }
    }
}
