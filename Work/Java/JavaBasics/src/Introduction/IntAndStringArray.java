package Introduction;

import java.util.*;

public class IntAndStringArray {

	public static void main(String[] args) {

		String[] names = { "sowmya", "vrundha", "roja", "pallavi" };
		System.out.println(names.length);

		for (String na : names) {
			System.out.println(na);
		}

		String[] values = new String[4];

		values[0] = "sowmya";
		values[1] = "roja";
		values[2] = "pallavi";
		values[3] = "vrundha";

		Arrays.sort(values);
		for (String v : values) {
			System.out.println(v);

		}

		int[] numbers = { 1, 2, 3 };
		int[] sum = new int[3];
		sum[0] = 1;
		sum[1] = 2;
		sum[2] = 3;

		for (int s : sum) {

			System.out.println(s);
		}

		for (int n : numbers) {
			System.out.println(n);
		}
	}
}
