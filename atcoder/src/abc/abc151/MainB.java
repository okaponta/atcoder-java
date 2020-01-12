package abc.abc151;

import java.util.Scanner;

public class MainB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		int total = 0;
		for (int i = 1; i < n; i++) {
			int point = sc.nextInt();
			total = total + point;
		}
		int remain = n * m - total;
		if (remain < 0) {
			print(0);
		} else if (remain > k) {
			print(-1);
		} else {
			print(remain);
		}
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
