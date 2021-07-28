import java.util.Scanner;

public class _10_MissingElement_Checked {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int avg = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
		sc.close();

		if (n >= 1 && k <= 1000) {
			double result = (double) ((avg * (n + k)) - sum) / (double) k;
			double chk = result - (int) result;
			if (chk > 0.0)
				System.out.println("-1");
			else
				System.out.println((int) result);
		} else
			System.out.println("ERROR");
	}
}
