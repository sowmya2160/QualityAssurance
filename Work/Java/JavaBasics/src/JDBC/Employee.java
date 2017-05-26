package JDBC;

public class Employee {

	private int idemployee;
	private String Name;
	private int Age;
	private String State;

	public Employee(int id, String name, int age, String state) {
		this.idemployee = id;
		this.Name = name;
		this.Age = age;
		this.State = state;
	}

	public int getId(int id) {
		return idemployee;
	}

	public void setId(int idemployee) {
		this.idemployee = idemployee;
	}

	public String getName(String name) {
		return Name;

	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge(int age) {
		return Age;

	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getState(String state) {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

}
