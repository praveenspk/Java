package com.spk.javaMaster;


public class ValidSudoku {
	public static void main(String[] args) {
		System.out.println("Entered into main()");
		ValidSudoku obj = new ValidSudoku();
		ValidSudoku.Solution sol = obj.new Solution();
		sol.isValidSudoku(null);
	}
	public class Solution {
		
		public boolean isValidSudoku(char[][] board) {
			System.out.println("isValidSudoku()");
			boolean[][] rows = new boolean[9][9];
			boolean[][] columns = new boolean[9][9];
			boolean[][] cells = new boolean[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (board[i][j] == '.') {
						continue;
					}
					int num = board[i][j] - '1';
					if (rows[i][num] || columns[j][num] || cells[i / 3 * 3 + j / 3][num]) {
						return false;
					}
					rows[i][num] = columns[j][num] = cells[i / 3 * 3 + j / 3][num] = true;
				}
			}
			return true;
		}
	}

	public static class UnitTest {

	}
}
