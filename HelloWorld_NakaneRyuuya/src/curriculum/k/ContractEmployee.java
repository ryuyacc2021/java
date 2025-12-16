package curriculum.k;

public class ContractEmployee extends Employee {

	
	private static final int hourlyRate = 1000;
	
	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}
	
	
	@Override
	public int calculateSalary() {
		return hours * hourlyRate;
	}
}
