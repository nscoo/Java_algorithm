package bruteforce;
import java.util.Scanner;

public class bruteforce_01_BOJ2798 {
    public int sol(int n,int m , int[] arr){
        int aa=0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++ ){
                    int tmp = arr[i]+arr[j]+arr[k];
                    if(tmp == m) return tmp;
                    else{
                        if(aa<tmp && tmp<m ) aa= tmp;
                    }
                }
            }
        }
        return aa;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        bruteforce_01_BOJ2798 t = new bruteforce_01_BOJ2798();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(t.sol(n,m,arr));

    }
}
