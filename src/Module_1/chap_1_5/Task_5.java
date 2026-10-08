package Module_1.chap_1_5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(a == -b || a == -c || a == -d || b == -c || b == -d || c == -d ? true : false);
    }
}
