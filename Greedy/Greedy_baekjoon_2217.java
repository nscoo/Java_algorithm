
import java.util.Arrays;
import java.util.Scanner;
public class Greedy_baekjoon_2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
		Arrays.sort(m);
		int max = m[n-1];
		for(int i =0; i<n-1; i++) {
			max = Math.max(max, m[i]*(n-i));
	
		}
		System.out.print(max);
	}
}
