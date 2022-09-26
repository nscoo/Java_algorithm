package Greedy;

import java.util.Arrays;
import java.util.Scanner;


public class greedy_04_baekjoon11047 {
    public int solution(int n, int k,int[] arr){
        Arrays.sort(arr);
        int ans =0;
        for(int i = n-1; i>=0 &&k>0; i-- ){
            if(k>=arr[i]){
                int tmp = k/arr[i];
                k%=arr[i];
                ans+=tmp;

            }
        }
        return ans;
    }
    public static void main(String[] args){
        greedy_04_baekjoon11047 t = new greedy_04_baekjoon11047();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print(t.solution(n,k,arr));

    }
}
