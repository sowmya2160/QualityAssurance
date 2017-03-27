package Introduction;

import java.util.ArrayList;

public class AddingToArrayList {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();

		animals.add("dog");
		animals.add("cat");
		animals.add("monkey");

		System.out.println(animals);
		System.out.println(animals.size());

		for (String a : animals) {

			System.out.println(a);
		}

		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);

		System.out.println(values);
		for (int v : values) {
			System.out.println(v);
		}

	}
}
