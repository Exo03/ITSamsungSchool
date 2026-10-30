package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        ans[0] = 4;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + 3;
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
