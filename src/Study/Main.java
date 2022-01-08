package Study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count=s.nextInt();
		
		for (int i = 0; i < count; i++) {
			int A = s.nextInt();
			int B = s.nextInt();
			if (0 < A && B < 10) {
				System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, A + B);
			} else {
				break;
			}
		}
		s.close();

	}

}
