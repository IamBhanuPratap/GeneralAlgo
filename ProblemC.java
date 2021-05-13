package ProblemG;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int numRows = stdin.nextInt();
		int numBlock = stdin.nextInt();
		while (numRows != 0) {
			int[][] rooms = new int[numRows][2];
			for (int i=0; i<numRows; i++)
				for (int j=0; j<2; j++)
					rooms[i][j] = stdin.nextInt();
			int[][][] dp = new int[numRows][numBlock+1][3];
			for (int i=0; i<numRows; i++)
				for (int j=0; j<=numBlock; j++)
					Arrays.fill(dp[i][j], -1);
			dp[0][0][0] = rooms[0][0] + rooms[0][1];
			if (numBlock > 0) dp[0][1][1] = rooms[0][1];
			if (numBlock > 0) dp[0][1][2] = rooms[0][0];
			for (int i=1; i<numRows; i++) {
				for (int j=0; j<=i+1 && j<=numBlock; j++) {
					if (maxArr(dp[i-1][j]) >= 0)
						dp[i][j][0] = rooms[i][0] + rooms[i][1] + maxArr(dp[i-1][j]);
					if (j > 0 && Math.max(dp[i-1][j-1][1], dp[i-1][j-1][0]) >= 0)
						dp[i][j][1] = rooms[i][1] + Math.max(dp[i-1][j-1][1], dp[i-1][j-1][0]);
					if (j > 0 && Math.max(dp[i-1][j-1][2], dp[i-1][j-1][0]) >= 0)
						dp[i][j][2] = rooms[i][0] + Math.max(dp[i-1][j-1][2], dp[i-1][j-1][0]);
				}
			}
			System.out.println(maxArr(dp[numRows-1][numBlock]));
			numRows = stdin.nextInt();
			numBlock = stdin.nextInt();
		}
		stdin.close();
	}
	public static int maxArr(int[] arr) {
		int res = arr[0];
		for (int i=1; i<arr.length; i++)
			res = Math.max(res, arr[i]);
		return res;
	}
		

	}
