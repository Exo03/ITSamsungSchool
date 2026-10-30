package Module_1.chap_1_9;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(sumOfThirteen(a));
    }

    public static int sumOfThirteen(int a) {
        int ans = 0;
        for (int i = 0; i < a; i++) {
            if (sumOfDigits(i) % 13 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static int sumOfDigits(int n){
        int ans = 0;
        int t = n;
        while(t > 0){
            ans += t%10;
            t /= 10;
        }
        return ans;
    }
}
