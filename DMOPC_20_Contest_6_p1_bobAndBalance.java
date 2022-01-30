package DMOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DMOPC_20_Contest_6_p1_bobAndBalance {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> differenceList = new ArrayList<Integer>();
		int numScales = Integer.parseInt(br.readLine());
		int counter = 0;
		String weights = (br.readLine());
		String arr[] = weights.split(" ");

		int intArr[] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(intArr);

		for (int p = 0; p < numScales * 2; p++) {

			for (int index = 0; index < numScales * 2; index++) {
				
				if (Integer.parseInt(arr[index]) == intArr[p]) {
					arr[index] = "-1";
					differenceList.add(index + 1);

					break;
				}
			}

		}

		for (int i = 0; i < numScales; i++) {

			if (intArr[i] != intArr[intArr.length - 1 - i]) { // checking to see if it no equal
				counter++;
			}

		}
		System.out.println(counter);
		for (int y = 0; y < numScales; y++) {
			System.out.println(differenceList.get(y) + " " + differenceList.get(intArr.length - 1 - y));

		}
	}
}
