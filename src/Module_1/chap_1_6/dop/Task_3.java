package Module_1.chap_1_6.dop;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 5) {
            if (x == 4) {
                System.out.println("IV");
            } else {
                System.out.println("I".repeat(x));
            }
        } else if (x < 10) {
            if (x == 9) {
                System.out.println("IX");
            } else {
                System.out.println("V" + "I".repeat(x % 5));
            }
        } else if (x < 50) {
            if (x / 10 == 4) {
                System.out.print("XL");
            } else {
                System.out.print("X".repeat(x / 10));
            }
            if (x % 10 == 9) {
                System.out.print("IX");
            } else if (x % 10 == 4) {
                System.out.println("IV");
            } else {
                if (x % 10 < 5) {
                    System.out.print("I".repeat(x % 10));
                } else {
                    System.out.print("V" + "I".repeat((x % 10) % 5));
                }
            }
        } else if (x < 100) {
            if (x / 10 == 9) {
                System.out.print("XC");
            } else {
                System.out.print("L");
                x -= 50;
                System.out.print("X".repeat(x / 10));
            }
            if (x % 10 == 9) {
                System.out.print("IX");
            } else if (x % 10 == 4) {
                System.out.println("IV");
            } else {
                if (x % 10 < 5) {
                    System.out.print("I".repeat(x % 10));
                } else {
                    System.out.print("V" + "I".repeat((x % 10) % 5));
                }
            }
        } else {
            System.out.println("C");
        }
    }
}
