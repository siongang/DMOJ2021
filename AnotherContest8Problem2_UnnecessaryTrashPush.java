package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherContest8Problem2_UnnecessaryTrashPush {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		for (int i = 0; i < number; i++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			String[] dailyAmount = br.readLine().split(" ");
			int push = 0;
			int value = 0;

			for (int p = 0; p < N; p++) { // days forloop
				int dailyTrash = Integer.parseInt(dailyAmount[p]);
				value = value + dailyTrash;

				if (value >= K) {
					push++;
					value = 0;

				}

			}
			System.out.println(push);

		}
	}
}
