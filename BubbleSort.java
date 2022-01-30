package DMOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		String[] array = input.split(" ");
		int intArr[] = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
		boolean switched = false;
		boolean continued = true;
		boolean initial = true;
		int value;
		boolean realSwitched = false;
		while (continued == true) {
			realSwitched = false;
			for (int k = 0; k < array.length - 1; k++) {
				// initial
				if (initial == true) {
					for (int i = 0; i < intArr.length; i++) {
						if ( i == 0) {
						System.out.print( intArr[i]);
						} else {
							System.out.print(" " + intArr[i]);
						}
					}
					initial = false;
				}

				switched = false;
				// sort
				if (intArr[k] > intArr[k + 1]) {
					value = intArr[k];
					intArr[k] = intArr[k + 1];
					intArr[k + 1] = value;
					switched = true;
					realSwitched = true;
				}
				// print
				if (switched == true) {
					for (int i = 0; i < intArr.length; i++) {
						if (i == 0) {
							System.out.print("\n" + intArr[i] );
						} else {
							System.out.print(" "+ intArr[i]);
						}
					}
				}

			}
		
		}
		if (realSwitched == false) {
			continued = false;
		}

	}
}
