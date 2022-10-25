
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_baekjoon_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++) al.add(sc.nextInt());
		
		Collections.sort(al);
		for(int x : al) al.get(x);
		
		
	}
}
