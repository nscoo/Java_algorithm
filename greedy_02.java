package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy_02 {

    public int solution(int  n, int m,  int[][] arr ) {
        int ans=0;

        for(int i=0; i<n; i++){
            int min =101;
            for(int j =0; j<m; j++){
                min = Math.min(min,arr[i][j]);
            }
            ans = Math.max(ans,min);
        }
        return ans;
    }

    public static void main(String[] args) {
        greedy_02 t = new greedy_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(t.solution(n,m,arr));
    }
}


