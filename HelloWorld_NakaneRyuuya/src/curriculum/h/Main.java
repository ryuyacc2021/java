package curriculum.h;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		// 正社員オブジェクトを作成
		Employee fullTime = 
				new FullTimeEmployee("E001" , "正社員");
		
		// パートオブジェクトを作成
		Employee partTime =
				new PartTimeEmployee("P001" , "パート社員");
		
		
		// 正社員が9時間働いた給与を出力する
			System.out.println("正社員の給与" + fullTime.calculateDailyWage(9) + "円");
		
		// パートが9時間働いた給与を出力する
			System.out.println("パートの給与" + partTime.calculateDailyWage(9) + "円");
	}

}
