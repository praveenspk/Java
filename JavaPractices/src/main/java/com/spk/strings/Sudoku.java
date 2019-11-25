package com.spk.strings;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

	public static void main(String[] args) {

		int[][] sudoku = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 },
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 },
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 },
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 },
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		// System.out.println(new Refactored().validateSudoku(sudoku));
	}

	public static boolean validateSudoku(int[][] sudoku) {
		Set<Integer> setHoriz = new HashSet<>();
		Set<Integer> setVertical = new HashSet<>();
		Set<Integer> setDiagonal = new HashSet<>();
		int sizeDiag, sizeHoriz, sizeVertical;

		for (int col = 0; col < sudoku.length; col++) {
			for (int row = 0; row < sudoku.length; row++) {
				if ((col == 0 || col == 3 || col == 6) && (row == 0 || row == 3 || row == 6)) {
					for (int sj = col; sj < col + 3; sj++) {
						for (int si = row; si < row + 3; si++) {
							sizeDiag = 1;
							if (sizeDiag != 9) {
								setDiagonal.add(sudoku[si][sj]);
								sizeDiag++;
							}
						}
					}
					if (setDiagonal.size() != 9)
						return false;
					setDiagonal.removeAll(setDiagonal);
					sizeDiag = 1;
				}
				sizeHoriz = 1;
				sizeVertical = 1;
				if (sizeHoriz != 9 || sizeVertical != 9) {
					setHoriz.add(sudoku[col][row]);
					setVertical.add(sudoku[row][col]);
					sizeVertical++;
					sizeHoriz++;
				}
			}
			if (setHoriz.size() != 9 || setVertical.size() != 9)
				return false;
			setHoriz.removeAll(setHoriz);
			setVertical.removeAll(setVertical);
			sizeVertical = 1;
			sizeHoriz = 1;
		}
		return true;
	}

}
