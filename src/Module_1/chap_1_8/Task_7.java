package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(a[i] < 0){
                ans[cnt] = a[i];
                cnt++;
            }
        }
        for(int i=0; i<n; i++){
            if(a[i] >= 0){
                ans[cnt] = a[i];
                cnt++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
