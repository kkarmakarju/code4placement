import java.io.*;

class _04_DailyMarketting {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n[] = in.readLine().split(" ");
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (n.length != 7) {
			System.out.println("Error");
			return;
		}
		double x = Double.parseDouble(n[0]);
		double y = Double.parseDouble(n[1]);
		double z = Double.parseDouble(n[2]);
		double t = Double.parseDouble(n[3]);
		double w = Double.parseDouble(n[4]);
		int month = Integer.parseInt(n[5]);
		int year = Integer.parseInt(n[6]);

		if (x < 0 || y < 0 || z < 0 || t < 0 || w < 0 || month < 1 || month > 12 || year < 0)
			System.out.println("Error");
		else {
			boolean isLY = false;
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						isLY = true;
				} else
					isLY = true;
			}

			if (isLY)
				months[1] = 29;

			if (y <= x || y <= z || y <= t || y <= w) {
				System.out.println("Error");
			} else {
				Double sum = (x + y + z + t + w);
				System.out.println(String.format("%.6f", sum) + " " + String.format("%.6f", (sum * months[month - 1])));
			}
		}
	}
}