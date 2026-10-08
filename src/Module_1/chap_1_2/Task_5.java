package Module_1.chap_1_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int h, m, s;
        h = a/3600%24;
        m = a%3600/60;
        s = a%60;
        System.out.print(h + ":" + m/10);
        System.out.print(m%10 + ":" + s/10);
        System.out.print(s%10);
    }
}
