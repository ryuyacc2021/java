package curriculum.h;

	// 抽象クラス作成
	public abstract class Employee {
	
	protected String employeeId, name;
	
	// コンストラクタ
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	// 共通メソッド作成
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
		
	}
	
	// 抽象メソッド作成
	public abstract int calculateDailyWage(int hoursWorked);
}