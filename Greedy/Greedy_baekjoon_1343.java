
import java.util.Scanner;

public class Greedy_baekjoon_1343 {
	public String sol(String in) {
		String ans = "";
		
		in=in.replaceAll("XXXX", "AAAA");
		ans = in.replaceAll("XX", "BB");
		
		if(ans.contains("X")) return "-1";
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Greedy_baekjoon_1343 t = new Greedy_baekjoon_1343();
		String in = sc.nextLine();

		System.out.println(t.sol(in));
	}
}
