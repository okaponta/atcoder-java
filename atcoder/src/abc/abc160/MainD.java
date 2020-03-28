package abc.abc160;

import java.util.Scanner;

public class MainD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		int[] answer = new int[n];

		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int direct = j - i;
				int shortCut = Math.abs(i - x) + 1 + Math(j - y);
				int dist = Math.min(direct, shortCut);
				answer[dist]++;
			}
		}

		for (int i = 1; i < n; i++) {
			print(answer[i]);
		}

	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
