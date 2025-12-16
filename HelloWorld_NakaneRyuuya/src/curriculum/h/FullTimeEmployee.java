package curriculum.h;

	// Employeeを継承した正社員クラス
	public class FullTimeEmployee extends Employee {

	
	// 時給
	private static final int HOURLY_RATE = 1200;
	
	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	// 給与計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		if(hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		} else {
			
			int normalPay = 8 * HOURLY_RATE;
			int overtimePay = (int)((hoursWorked - 8) * HOURLY_RATE * 1.25);
					return normalPay + overtimePay;
		}
	}
	
	
	
}
