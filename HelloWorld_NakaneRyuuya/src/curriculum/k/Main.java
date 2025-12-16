package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		List<Billable> list = new ArrayList<>();
		
		
		list.add(new FullTimeEmployee("正社員", 9));
		list.add(new ContractEmployee("契約社員" , 9));
		
		
		
		SalaryCalculator calc = new SalaryCalculator();
		
		for (Billable b : list) {
			calc.printSalary(b);
		}
		
		
	}

}
