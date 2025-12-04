package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Int型変数に値を代入
		int score = 75;
		
		// 変数が60以上の場合
		if (score >= 60) {
			
			// 結果を出力する
			System.out.println("合格です！");
		}
		
		
		// Int型変数に25を代入
		int age = 25;
		
		// ageが20以上かつ30以下の場合
		if (age >= 20 && age <=30) {
			
		// 条件に合う場合の出力
			System.out.println("適正年齢です");
		} else {
			
		// 条件に合わない場合の出力
			System.out.println("対象外です");
		}
		
		
		age = 12;
		
		
		if (age >= 20) {
			System.out.println("成人です");
		} else if (age >= 13 && age <=19) {
			System.out.println("ティーンエイジャーです");
			
		} else if (age >= 12) {
			System.out.println("子供です");
			
		}
		
	
		
				
	}
	

}
