package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i] + " ");
        }
    }
}
