

import java.util.Scanner;
public class Greedy_baekjoon_1439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		
		int one = 0, zero = 0;
		char tmp = a[0];
		for(int i=1; i<a.length; i++) {
			if(tmp != a[i]) {
				tmp = a[i];
				if(tmp == '0') one++;
				if(tmp == '1') zero++;
			}
		}
		if(tmp == '0') zero++;
		else one++;
		System.out.print(Math.min(zero, one));
	}
}
