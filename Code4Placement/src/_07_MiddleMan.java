import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _07_MiddleMan {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> nums = new ArrayList<Integer>();
		String result = "";
		for (int i = 0; i < n; i++) {
			nums.add(Integer.parseInt(br.readLine().trim()));
		}
		Collections.sort(nums);
		int mid = nums.size();
		int i = 1;
		for (int num : nums) {
			result = (i % 2 == 0) ? result + num : num + result;
			i++;
		}
		System.out.println(result);
	}
}
