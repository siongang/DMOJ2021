package DMOJ;

import java.util.Scanner;

public class DMOJ_ticTacMoe {
	public static void main(String args[]) {
		/*
		 * create a tictacto board by using array check through each line and diagonal
		 * to see matching chars if so, end program
		 */

		Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];

		int counter;
		char value;
		char letter;
		boolean o = false;
		boolean x = false;

		for (int i = 0; i < 3; i++) {
			String input = sc.nextLine();
			for (int k = 0; k < 3; k++) {
				board[i][k] = input.charAt(k);

			}

		}

		for (int m = 0; m < 2; m++) { // loop for O and X
			if (m == 0) {
				letter = 'O';
			} else {
				letter = 'X';
			}

			everything: for (int t = 0; t < 3; t++) {
				counter = 0;

				// horizontal
				if (t == 0) {

					counter = 0;
					int k;
					for (int i = 0; i < 3; i++) {
						counter = 0;
						for (k = 0; k < 3; k++) {

							value = board[i][k];
							if (value == letter) {
								counter++;
							} else {
								counter = 0;
								break;
							}

							if (counter == 3) {

								if (m == 0) {
									o = true;

								} else {
									x = true;

								}

								break everything;

							}

						}
					}

				}

				if (t == 1) {

					counter = 0;

					for (int i = 0; i < 3; i++) {
						counter = 0;
						for (int k = 0; k < 3; k++) {

							value = board[k][i];
							if (value == letter) {
								counter++;
							} else {
								counter = 0;
								break;
							}

							if (counter == 3) {
								if (m == 0) {
									o = true;

								} else {
									x = true;

								}

								break everything;
							}

						}
					}
				}

				if (t == 2) {

					int l = 0;
					counter = 0;

					for (int k = 0; k < 3; k++) {

						value = board[k][l];
						l++;
						if (letter == value) {
							counter++;

						} else {
							break;
						}

						if (counter == 3) {
							if (m == 0) {
								o = true;

							} else {
								x = true;

							}
							break everything;
						}

					}
					l = 2;
					counter = 0;

					for (int k = 0; k < 3; k++) {

						value = board[k][l];
						l--;
						if (letter == value) {
							counter++;

						} else {
							break;
						}

						if (counter == 3) {

							if (m == 0) {
								o = true;

							} else {
								x = true;

							}
							break everything;
						}

					}

				}
			}
		}
		if (o && x == true)

		{
			System.out.println("Error, redo");

		} else if (o == true) {
			System.out.println("Griffy");

		} else if (x == true) {
			System.out.println("Timothy");

		} else {
			System.out.println("Tie");
		}

	}

}
