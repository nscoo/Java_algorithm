package Greedy;

import java.util.Scanner;


public class greedy_04_baekjoon1541 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("-");
        int sum = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            int tmp =0;
            String[] add = a[i].split("\\+");
            for(int j =0; j<add.length; j++){
                tmp +=Integer.parseInt(add[j]);
            }
            if(sum==Integer.MAX_VALUE){
                sum = tmp;
            }else{
                sum-=tmp;
            }

        }
        System.out.print(sum);
    }
}
