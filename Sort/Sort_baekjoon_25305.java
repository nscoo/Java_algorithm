
import java.util.Arrays;
import java.util.Scanner;

public class Sort_baekjoon_25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-k]);
		
	}
	
}
