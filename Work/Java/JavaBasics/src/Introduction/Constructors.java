package Introduction;

public class Constructors {

	private String name;
	private int age;
	private double height;

	public Constructors() { //default constructor

	}

	public Constructors(String name, int age) { //parameterized constructor with 2 parameters
		this.name = name;
		this.age = age;
	}

	public Constructors(String name, int age, double height) { ////parameterized constructor with 3 parameters
		this.name = name;
		this.age = age;
		this.height = height;
	}

	void display(){
		System.out.println(name + " " + age + " " + height);
	}
	
	public static void main(String[] args) {
		Constructors d1 = new Constructors();
		Constructors d2 = new Constructors("sowmya",25);
		Constructors d3 = new Constructors("sruthi",30,5.4);
		
		d1.display();
		d2.display();
		d3.display();
		
	}
}
