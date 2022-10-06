package Greedy;

import java.util.Scanner;


public class greedy_04_baekjoon1931 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(max<arr[i]) {
                ans+=max;
                max = arr[i];
            }else{

                ans+=arr[i];
            }
        }
        System.out.print(ans);
    }
}
