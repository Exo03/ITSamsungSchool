package Module_1.nested_loops;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
            ans++;
        }
        if (a > b) {
            System.out.println(a + " " + ans);
        } else {
            System.out.println(b + " " + ans);
        }
    }
}
