
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_baekjoon_12845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++) al.add(sc.nextInt());
		
		al.sort(Collections.reverseOrder());
		int max = al.get(0);
		int sum =0;
		for(int i=1; i<al.size(); i++) {
			sum += max + al.get(i);
		}
		System.out.print(sum);
		
	}
}
