package curriculum.k;

public class FullTimeEmployee extends Employee {

	
	private static final int hourlyRate = 1200;
	
	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}
	
	
	@Override
	public int calculateSalary() {
		return hours * hourlyRate;
	}
}
