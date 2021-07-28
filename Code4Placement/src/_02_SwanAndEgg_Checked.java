import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class _02_SwanAndEgg_Checked {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			line = br.readLine();
		} catch (IOException e) {

		}
		int sum = 0;
		int n;
		String arr[] = line.split(" ");
		n = Integer.parseInt(arr[0]);

		if (n != arr.length - 1)
			System.out.println("Error");
		else {
			boolean flag = true;
			for (int i = 1; i <= n; i++) {
				int week = Integer.parseInt(arr[i]);
				if (week < 1) {
					flag = false;
					break;
				}

				if (week >= 52)
					sum += 16;
				else if (week <= 48)
					;
				else
					sum += (week + 4 - 52) * 4;
			}
			if (flag)
				System.out.println(sum);
			else
				System.out.println("Error");
		}
	}
}