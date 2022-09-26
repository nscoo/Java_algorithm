package Greedy;

import java.util.Scanner;

public class greedy_03 {
    public int solution(int n, int k){
        int ans = 0;
        while(n>0){
            if(n%k ==0){
                n/=k;
                ans ++;
            }else{
                n--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        greedy_03 t = new greedy_03();
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(t.solution(n,k));
    }
}
