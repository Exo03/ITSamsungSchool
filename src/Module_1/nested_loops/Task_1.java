package Module_1.nested_loops;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[10];
        boolean ans = false;
        while (n > 0) {
            if (a[n % 10] == 1) {
                ans = true;
                break;
            }
            a[n % 10] = 1;
            n /= 10;
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
