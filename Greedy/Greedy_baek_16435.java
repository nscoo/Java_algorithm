package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_baek_16435 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] h = new int[N];
        for(int i=0; i<N; i++) h[i] = sc.nextInt();
        Arrays.sort(h);
        for(int x : h){
            if(L>=x) L++;
            else break;
        }
        System.out.print(L);
    }

}
