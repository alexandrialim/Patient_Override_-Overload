
public class ChildPatient extends Patient{
	private String parentName;
	private String name;
	private int age;
	public ChildPatient(String name, int age, String p) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.parentName = p;
		toString();
	}
	public double dosage(){
		return 300.0;
	}
	public String toString(){
		return "Patient " + name + " is " + age + " years old " + "and had parent " + parentName + ".";
	}
}
