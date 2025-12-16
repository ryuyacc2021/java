package curriculum.j;
	// 親クラスを継承
public class ContractEmployee extends Employee {

	// 時給
	private static final int hourlyRate = 1000;
	
	// コンストラクタ
	public ContractEmployee(String id, String name) {
		super(id, name);
	}
	
	// 給料計算
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * hourlyRate;
	}
}
