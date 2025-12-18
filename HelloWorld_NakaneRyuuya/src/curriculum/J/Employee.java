package curriculum.J;
	//抽象クラス作成
public abstract class Employee implements Billable {

	protected String id, name;
	
	// コンストラクタ
	public Employee(String id, String name) {
	this.id = id;
	this.name = name;
	
}

	// 日給計算をサブクラスに委任
	public abstract int costForDay(int hoursWorked);
}
