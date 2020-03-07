package abc.abc158;

import java.util.Scanner;

public class MainD {

	public static void main(String[] args) {

		boolean isReverse = false;

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		StringBuilder front = new StringBuilder();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				isReverse = !isReverse;
			} else {
				int f = sc.nextInt();
				if ((f == 1 && !isReverse) || (f == 2 && isReverse)) {
					front.append(sc.next());
				} else {
					sb.append(sc.next());
				}
			}
		}
		sc.close();

		if (isReverse) {
			print(sb.reverse().toString() + front.toString());
		} else {
			print(front.reverse().toString() + sb.toString());
		}
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
