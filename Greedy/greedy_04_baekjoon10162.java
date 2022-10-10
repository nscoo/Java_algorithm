package Greedy;

import java.util.Scanner;


public class greedy_04_baekjoon10162 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%10!=0) System.out.print(-1);
        else{
            int a = n/300;
            n%=300;
            int b = n/60;
            n%=60;
            int c= n/10;
            n%=10;
            System.out.print(a+" "+b+" "+c);
        }


    }
}
