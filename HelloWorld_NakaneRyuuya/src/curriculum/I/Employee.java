package curriculum.I;

// 抽象クラス作成
public abstract class Employee {

	protected String id, name;

	// コンストラクタ
	public Employee(String id, String name) {
	this.id = id;
	this.name = name;
}

	public String getName() {
		return name;
	}
	
	// 抽象メソッド作成
	public abstract int calculateDailyWage(int hoursWorked);
}


