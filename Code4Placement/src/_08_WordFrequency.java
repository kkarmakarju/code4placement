import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _08_WordFrequency {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine().trim().toLowerCase();
		HashMap<String, Integer> freq = new HashMap<String, Integer>();
		text = text.substring(0, text.length());
		if (text.charAt(text.length() - 1) != '$') {
			System.out.println("ERROR");
			return;
		}
		String[] words = text.substring(0, text.length() - 2).split(" ");
		int maxfreq = 1;
		for (String word : words) {
			if (!freq.containsKey(word))
				freq.put(word, 1);
			else {
				freq.put(word, freq.get(word) + 1);
				if (freq.get(word) > maxfreq)
					maxfreq = freq.get(word);
			}
		}
		boolean isfirst = true;
		for (String s : words)
			if (freq.get(s) == maxfreq)
				if (isfirst) {
					System.out.print(s);
					isfirst = false;
				} else {
					System.out.print(", " + s);
				}
	}
}
