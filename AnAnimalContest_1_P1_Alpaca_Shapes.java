package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnAnimalContest_1_P1_Alpaca_Shapes {
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		if (Integer.parseInt(arr[0]) * Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) * Integer.parseInt(arr[1]) * 3.14)  {
			System.out.println("SQUARE");
			
		} else {
			System.out.println("CIRCLE");
			
		}

	}
}
