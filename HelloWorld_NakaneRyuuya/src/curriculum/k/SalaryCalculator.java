package curriculum.k;

public class SalaryCalculator {
	
	public void printSalary(Billable b) {
		System.out.println(b.calculateSalary() + "円");
	}
}