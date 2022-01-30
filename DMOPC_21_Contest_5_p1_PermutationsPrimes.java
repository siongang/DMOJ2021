package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DMOPC_21_Contest_5_p1_PermutationsPrimes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int temp = 0;
		boolean can = false; // can make permetu

		if (n == 4 || n == 2 || n == 3) {
			System.out.println("-1");

		} else if (n == 1) {
			System.out.println("1");
		} else {
			int oddCounter = 0;
			oddCounter = (int) Math.ceil(n / 2.0);
			for (int i = 0; i < oddCounter; i++) {
				arr[i] = i * 2 + 1;
			}

			if (arr[oddCounter - 1] != 5) {

				temp = arr[oddCounter - 1];
				arr[2] = temp;
				arr[oddCounter - 1] = 5;
			}

			int num = 2;

			for (int i = oddCounter; i < n; i++) {
				arr[i] = num;
				num = num + 2;
			}

			temp = 2;
			arr[oddCounter + 1] = temp;
			arr[oddCounter] = 4;

			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]);
				if (i + 1 < n) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
