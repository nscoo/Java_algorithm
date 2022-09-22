package Greedy;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class greedy_01 {

    public int solution(int  n, int m, int k, int[] arr ) {
        int ans =0;
        Arrays.sort(arr);
        int first = arr[n-1];
        int second = arr[n-2];

        /*
        빠르게 풀 순 있지만 시간복잡도가 높음
        수식을 만들어서 푸는 방법이 더 나음
        while (true){
            for(int i =0; i<k; i++){
                if (m==0) break;
                ans+=first;
                m--;
            }
            if(m==0) break;
            ans += second;
         m--;
     }
         */
        int count = (int)(m/(k+1))*k;
        count += m % (k+1);
        ans += count * first;
        ans += (m-count) * second;


        return ans;
    }

    public static void main(String[] args) {
        greedy_01 t = new greedy_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print(t.solution(n,m,k,arr));
    }
}


