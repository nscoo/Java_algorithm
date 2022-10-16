
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_baekjoon_9237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			max = Math.max(arr[i]+(i+1), max);
		}
		System.out.print(max+1);
	}
}
