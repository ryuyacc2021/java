package curriculum.i;
	// 親クラスを継承
public class FullTimeEmployee extends Employee {
	
	// 時給
	private static final int HOURLY_RATE = 1250;
	
	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	// 給料計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
	int overtime = Math.max(0, hoursWorked -8);
	int regularHours = hoursWorked - overtime;
		return(regularHours * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
}		
}