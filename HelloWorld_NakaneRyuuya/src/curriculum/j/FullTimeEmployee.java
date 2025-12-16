package curriculum.j;
	// 親クラスを継承
public class FullTimeEmployee extends Employee {
	
	// 時給
	private static final int hourlyRate = 1250;
	
	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
		
	// 給料計算
	@Override
	public int costForDay(int hoursWorked) {
		if(hoursWorked <= 8) {
			return hoursWorked * hourlyRate;
		} else {
			int normal = 8 * hourlyRate;
			int overtime = (int)((hoursWorked - 8) * hourlyRate * 1.25);
			return normal + overtime;
		}
	}
	
}
