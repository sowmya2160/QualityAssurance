package Methods;

import java.util.Date;

public class DatatypeMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int m = 10;
		int n = 5;

		Person(a, b);

		MethodsReturn mr = new MethodsReturn();
		Date date = new Date();
		System.out.println(mr.add(m, n));
		System.out.println(mr.substract(m, n));
		System.out.println(mr.result());
		System.out.println(mr.multiple(m, n));
		System.out.println(date);
	}

	public static void Person(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

}
