package Greedy;

import java.util.Arrays;
import java.util.Scanner;


public class greedy_04_baekjoon1026 {
    public int solution(int n, int[] arr1,int[] arr2){
        int ans =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<n; i++){
            ans += arr1[i]*arr2[n-i-1];
        }

        return ans;
    }
    public static void main(String[] args){
        greedy_04_baekjoon1026 t = new greedy_04_baekjoon1026();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) arr1[i] = sc.nextInt();
        for(int i=0; i<n; i++) arr2[i] = sc.nextInt();
        System.out.print(t.solution(n,arr1,arr2));
    }
}
