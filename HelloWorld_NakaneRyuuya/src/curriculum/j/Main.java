package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// リストの作成
		List<Billable> employees = new ArrayList<>();
		
		// 社員を追加
		employees.add(new FullTimeEmployee("E001" , "正社員"));
		employees.add(new ContractEmployee("C001" , "契約社員"));
		
		// 日給を計算して出力する
		for(Billable e : employees) {
			System.out.println(e.costForDay(9) + "円");
		}
		
	}

}
