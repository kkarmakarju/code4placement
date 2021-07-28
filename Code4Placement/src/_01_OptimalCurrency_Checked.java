/* 
 * PROBLEM STATEMENT
 * ============================
 * In Indian Currency notes and coins are available 
 * from Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 20, Rs. 50, Rs. 100, Rs. 200, Rs. 500, and Rs. 2000. 
 * A person saves a valid amount not exceeding a sum of Rs. 25000 with least number of notes or coins. 
 * Write a program to determine the number of notes or coins when the total saving amount is given. 
 * IT will display “Error” for any invalid cause of the program.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_OptimalCurrency_Checked {
	public static void main(String[] args) throws IOException {
		/* Read input */
		// System.out.println("Enter amount: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long amount = Long.parseLong(in.readLine());

		long count = 0;
		if (amount > 0 || amount < 25000) {
			if (amount >= 2000) {
				count = amount / 2000;
				System.out.print(count + " ");
				amount = amount - (2000 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 500) {
				count = amount / 500;
				System.out.print(count + " ");
				amount = amount - (500 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 200) {
				count = amount / 200;
				System.out.print(count + " ");
				amount = amount - (200 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 100) {
				count = amount / 100;
				System.out.print(count + " ");
				amount = amount - (100 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 50) {
				count = amount / 50;
				System.out.print(count + " ");
				amount = amount - (50 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 20) {
				count = amount / 20;
				System.out.print(count + " ");
				amount = amount - (20 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 10) {
				count = amount / 10;
				System.out.print(count + " ");
				amount = amount - (10 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 5) {
				count = amount / 5;
				System.out.print(count + " ");
				amount = amount - (5 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 2) {
				count = amount / 2;
				System.out.print(count + " ");
				amount = amount - (2 * count);
			} else {
				System.out.print("0 ");
			}
			if (amount >= 1) {
				System.out.print(amount);
			} else {
				System.out.print("0");
			}
		} else {
			System.out.println("Error");
		}

	}
}