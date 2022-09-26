package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class greedy_04_baekjoon13904 {
    static class HW{
        int d;
        int w;
        HW(int d,int w){
            this.d = d;
            this.w =w;
        }
    }

    public static void main(String[] args){
        greedy_04_baekjoon13904 t = new greedy_04_baekjoon13904();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int maxDay = 0;
        List<HW> list = new ArrayList<>();
        for(int i=0; i<n; i++){
           int d = sc.nextInt();
           int w = sc.nextInt();
           list.add(new HW(d,w));
           maxDay = Math.max(maxDay,d);
        }
        int sum = 0;
        for(int i= maxDay; i>0; i--){
            HW ans = new HW(0,0);
            for(HW hw : list){
                if(hw.d>=i){
                    if(ans.w<hw.w){
                        ans = hw;
                    }
                }
            }
            sum +=ans.w;
            list.remove(ans);
        }
     System.out.print(sum);
    }
}
