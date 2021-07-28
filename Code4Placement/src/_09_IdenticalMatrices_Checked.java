import java.util.*;

class _09_IdenticalMatrices_Checked {

	static int countOps(int A[][], int B[][], int m, int n) {
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				A[i][j] -= B[i][j];

		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				if (A[i][j] - A[i][0] - A[0][j] + A[0][0] != 0)
					return -1;

		int result = 0;

		for (int i = 0; i < m; i++)
			result += Math.abs(A[i][0]);

		for (int j = 0; j < n; j++)
			result += Math.abs(A[0][j] - A[0][0]);

		return (result);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat1[][] = new int[m][n];
		int mat2[][] = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				mat1[i][j] = sc.nextInt();
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				mat2[i][j] = sc.nextInt();

		System.out.println(countOps(mat1, mat2, m, n));
	}
}