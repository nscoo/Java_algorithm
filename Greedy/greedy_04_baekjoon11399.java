package Greedy;

import java.util.Arrays;
import java.util.Scanner;


public class greedy_04_baekjoon11399 {
    public int solution(int n, int[] arr){
        int ans =0;
        Arrays.sort(arr);
        int a =arr[0];
        int[] tmp = new int[n];
        tmp[0] = arr[0];
        for(int i=1; i<n; i++){
            a+=arr[i];
            tmp[i] = a;

        }
        for(int x : tmp) ans+=x;
        return ans;
    }
    public static void main(String[] args){
        greedy_04_baekjoon11399 t = new greedy_04_baekjoon11399();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print(t.solution(n,arr));
    }
}
