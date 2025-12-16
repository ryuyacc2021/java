package curriculum.i;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Employee 型のリストを作る
		List<Employee> employees = new ArrayList<>();
		
		
		 // 正社員・契約社員を混ぜて追加
		employees.add(new FullTimeEmployee("E001", "正社員A"));
		employees.add(new ContractEmployee("E002", "契約社員B"));
		
		 // for-each で回す
		for (Employee emp : employees) {
			int wage = emp.calculateDailyWage(9);
			System.out.println(emp.getName() + "の給料:" + wage + "円");
		}
		
	}

}
