public class Patient{
private String name;
private int age;
	public Patient(String name, int age) {
		this.name = name;
	}
	public String getName(){
		return this.name = name;
	}
	public double dosage(){
		return 600.0;
	}
	public double bmi (double heightInMeters, double weightInKilograms){
		return (weightInKilograms / (heightInMeters * heightInMeters));
	}
	public double bmi (double height, String heightUnits, double weight, String weightUnits){
		if(weightUnits.equals("lbs") && heightUnits.equals("in")){
			return(weight / (height * height) * 703);
		}
		if(weightUnits.equals("stone") && heightUnits.equals("cm")){
			weight = weight * 14;
			height = height * 0.393701;
			return (weight / (height * height) * 703);
		}
		return (weight / (height * height));
	}
	public String toString(){
		return "Patient " + name + " is " + age + " years old.";
	}
}
