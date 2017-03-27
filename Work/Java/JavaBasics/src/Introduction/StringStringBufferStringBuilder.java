package Introduction;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {

		// create space in string constant pool as it is String literal
		String str = "Saibersys";
		str += "hello";
		System.out.println(str);
		// create space in heap memory
		// creates another ref as it is immutable
		String a = new String("Amensys");
		a += "Hi";
		System.out.println(a);
		// create space in heap memory 
		// doesn't create another space as it is mutable
		StringBuffer b = new StringBuffer("Good");
		b.append("work");
		System.out.println(b);
		// same like StringBuffer but it is not thread safe
		StringBuilder c = new StringBuilder("Keep");
		c.append(" it up");
		System.out.println(c);

	}

}
