import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_WordSorter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();

		input = input.trim();
		if (input.charAt(input.length() - 1) != '.' && input.charAt(input.length() - 1) != '?'
				&& input.charAt(input.length() - 1) != '!' && input.charAt(input.length() - 1) != ',') {
			System.out.println("ERROR");
			return;
		}
		input = input.substring(0, input.length() - 1);
		input.replace(',', ' ');

		String words[] = input.split(" ");
		int posVal[] = new int[words.length];

		int i = 0;
		for (String word : words) {
			for (int j = 0; j < word.length(); j++)
				posVal[i] += word.charAt(j) - 65;

			System.out.println(posVal[i]);
			i++;
		}
		for (i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length - i - 1; j++) {
				if (posVal[j] > posVal[j + 1]) {
					int temp = posVal[j];
					posVal[j] = posVal[j + 1];
					posVal[j + 1] = temp;

					String str = words[j];
					words[j] = words[j + 1];
					words[j + 1] = str;
				}
			}
		}
		System.out.println("=====================");
		for (i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println();
	}
}