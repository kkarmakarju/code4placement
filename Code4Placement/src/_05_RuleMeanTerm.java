import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_RuleMeanTerm {

	static int getDecimal(String st) {
		return Integer.parseInt(st, 2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] st = br.readLine().split(" ");
		int n = Integer.parseInt(st[0]);
		int p = Integer.parseInt(st[1]);

		String text[] = br.readLine().split(" ");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(text[i]);
		}

		if (text.length != n) {
			return;
		}
		int r[] = new int[n];
		if (p == 0) {
			r[0] = getDecimal("0" + String.valueOf(a[0]) + String.valueOf(a[1]));
			r[n - 1] = getDecimal(String.valueOf(a[n - 1 - 1]) + String.valueOf(a[n - 1]) + "0");
			for (int j = 1; j < n - 1; j++) {
				r[j] = getDecimal(String.valueOf(a[j - 1]) + String.valueOf(a[j]) + String.valueOf(a[j + 1]));
			}
		}

		if (p == 1) {
			r[0] = getDecimal(String.valueOf(a[n - 1]) + String.valueOf(a[0]) + String.valueOf(a[1]));
			r[n - 1] = getDecimal(String.valueOf(a[n - 1 - 1]) + String.valueOf(a[n - 1]) + String.valueOf(a[0]));

			for (int j = 1; j < n - 1; j++) {
				r[j] = getDecimal(String.valueOf(a[j - 1]) + String.valueOf(a[j]) + String.valueOf(a[j + 1]));
			}
		}

		for (int i = 0; i < n - 1; i++)
			System.out.print(r[i] + " ");
		System.out.print(r[n - 1]);
	}
}