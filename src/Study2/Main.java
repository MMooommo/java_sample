package Study2;

import java.util.Scanner;

/**
 * 메인
 */
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();

		if (n >= 1 && x <= 10000) {
			for (int i = 0; i < n; i++) {
				int a = s.nextInt();
				if (a < x) {
					System.out.printf("%d ", a);
				}

			}
			s.close();
		}
	}
}
