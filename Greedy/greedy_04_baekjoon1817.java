package Greedy;

import java.util.Scanner;


public class greedy_04_baekjoon1817 {


    public static void main(String[] args){
        greedy_04_baekjoon1817 t = new greedy_04_baekjoon1817();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 1;
        int box=0;
        if(n!=0){
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            for(int i=0; i<n; i++){
                if(box+arr[i] <=m) box +=arr[i];
                else{
                    ans++;
                    box =arr[i];
                }
            }
        System.out.print(ans);
        }else{
            System.out.print(0);
        }
    }
}
