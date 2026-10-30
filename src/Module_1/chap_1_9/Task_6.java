package Module_1.chap_1_9;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i : minToBegin(a)) {
            System.out.println(i + " ");
        }
    }

    public static int[] minToBegin(int[] a) {
        int min = 1000000000, minId = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minId = i;
            }
        }
        for (int i = minId; i >= 1; i--) {
            a[i] = a[i - 1];
        }
        a[0] = min;
        return a;
    }
}
