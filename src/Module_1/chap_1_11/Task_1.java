package Module_1.chap_1_11;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int[][] ans = new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = a[n-j-1][i];
            }
        }
        System.out.println(m + " " + n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
