package template;

import java.util.Scanner;

public class Main {

	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		print(0);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

	public static long lcm(long num1, long num2) {
		return (num1 * num2 / gcd(num1, num2)) % MOD;
	}

	public static long gcd(long num1, long num2) {
		if (num2 == 0)
			return num1;
		else
			return gcd(num2, num1 % num2);
	}

}
