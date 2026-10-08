package Module_1.chap_1_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(((a*100 + b)*n)/100);
        System.out.print(" ");
        System.out.print(((a*100 + b)*n)%100);
    }
}
