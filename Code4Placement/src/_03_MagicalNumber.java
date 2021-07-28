import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class _03_MagicalNumber {
	
	public static String isMagicalNumber(String str) {
		long P = 1;
		long Q = 1;
		if (str.equals("0") || str.length() >= 10 || str.charAt(0) == '-')
			return "Error";
		else {
			for (int i = 0; i < str.length(); i += 2) {
				P *= (int) str.charAt(i) - 48;
			}
			for (int i = 1; i < str.length(); i += 2) {
				Q *= (int) str.charAt(i) - 48;
			}
			if (P < Q)
				return "Dominant";
			else
				return "Magical";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String elements[] = in.readLine().split(" ");
		String output = "";
		if (Integer.parseInt(elements[0]) != elements.length - 1) {
			System.out.println("Error");
		} else {
			for (int i = 1; i < elements.length - 1; i++) {
				output += isMagicalNumber(elements[i]) + " ";
			}
			output += isMagicalNumber(elements[elements.length - 1]);
		}
		System.out.println(output);
	}
}