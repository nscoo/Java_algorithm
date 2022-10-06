package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class greedy_04_baekjoon2720 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-->0){
            int money = Integer.parseInt(br.readLine());
            int q = money/25;
            money%=25;
            int d = money/10;
            money%=10;
            int n = money/5;
            money%= 5;
            int p = money;
            System.out.println(q+" "+d+" "+n+" "+ p);
        }
    }
}
