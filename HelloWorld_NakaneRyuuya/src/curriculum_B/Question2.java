package curriculum_B;

import java.util.Scanner;	// Scannerクラスをインポート

public class Question2 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		// =====================================
		// 問題１
		// =====================================
		
		// Int型変数に値を代入
		int score = 75;
		
		// 変数が60以上の場合
		if (score >= 60) {
			
			// 結果を出力する
			System.out.println("合格です！");
		}
		
		
		// =====================================
		// 問題２
		// =====================================
		
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
		
		
		// =====================================
		// 問題３
		// =====================================
		
		// Int型変数に18を代入
		age = 18;
		
		// ageが20以上の場合
		if (age >= 20) {
		
		// 条件に合う場合成人ですと出力する
			System.out.println("成人です");
			
		// ageが13以上かつ19歳以下の場合
		} else if (age >= 13 && age <=19) {
			
		// 条件に合う場合ティーンエイジャーですと出力する
			System.out.println("ティーンエイジャーです");
			
		// ageが12以下の場合
		} else if (age <= 12) {
			
		//　条件に合う場合子供ですと出力する
			System.out.println("子供です");
			
		}
		
		
		// =====================================
		// 問題４
		// =====================================
		
		// Int型変数に各々値を代入
		int x = 30, y = 15, z = 50;
		
		
		// 最大値を判定、出力する
		if (x >= y && x >= z) {
			System.out.println(x);
		
		} else if (y >= x && y >= z) {
			System.out.println(y);
		
		} else {
			System.out.println(z);
			
		}
		
		
		// =====================================
		// 問題５
		// =====================================
		
		// Scannerオブジェクトを作成し、入力を読み取れるように設定
		Scanner sc = new Scanner(System.in);
		
		// 整数の入力
			System.out.print("数値を入力してください：");
			
		// Int型変数をセットし次の単語を読み取る	
		int num = sc.nextInt();

		// 条件の設定
		if (num > 0) {
			
		// 入力した時に条件に合うものを出力する
		    System.out.println("正の数です");
		} else if (num == 0) {
		    System.out.println("0です");
		} else {
		    System.out.println("負の数です");
		}

		
		// =====================================
		// 問題６
		// =====================================
		
		// 整数の入力
		System.out.print("数値を入力してください：");
		
		// Int型変数をセットし次の単語を読み取る
		int value = sc.nextInt();

		// 入力された値が2で割り切れるなら偶数そうでないなら奇数と出力する
		if (value % 2 == 0) {
		    System.out.println("偶数です");
		} else {
		    System.out.println("奇数です");
		}
		
		// =====================================
		// 問題７
		// =====================================

		// 整数の入力
			System.out.print("得点を入力してください：");
		
		// Int型変数をセットし次の単語を読み取る	
		int Score = sc.nextInt();
		
		//条件設定をし、それに合うものを出力する
		if (Score >= 90) {
			System.out.println("優");
		} else if (Score >= 70) {
			System.out.println("良");
		} else if (Score >= 50) {
			System.out.println("可");
		} else if (Score < 50) {
			System.out.println("不可");
		}
		
		// =====================================
		// 問題８
		// =====================================
		sc.nextLine(); // 改行を消費
		
		
		// 整数の入力
			System.out.print("文字を入力してください：");
		
		// String型変数をセットし次の単語を読み取る
		String input = sc.nextLine();

		// null または 空文字のチェックし結果を出力する
		if (input == null || input.isEmpty()) {
			System.out.print("入力が無効です");
		} else {
			System.out.println("入力内容：" + input);
		}

		// =====================================
		// 問題９
		// =====================================
		
		// 曜日を表す
		int day = 5;
		
		// 整数dayに応じた結果を出力する
		switch (day) {
		case 1:
			System.out.println("今日は月曜日です");
			break;
		case 2:
			System.out.println("今日は火曜日です");
			break;
		case 3:
			System.out.println("今日は水曜日です");
			break;
		case 4:
			System.out.println("今日は木曜日です");
			break;
		case 5:
			System.out.println("今日は金曜日です");
			break;
		case 6:
			System.out.println("今日は土曜日です");
			break;
		case 7:
			System.out.println("今日は日曜日です");
			break;
		default:
			System.out.println("無効な入力です");
						
		   }
		
		// =====================================
		// 問題１０
		// =====================================
		
		
		// 整数の入力
			System.out.print("月を入力してください：");
	
		// Int型変数をセットし次の単語を読み取る	
		int month = sc.nextInt();
		
		// 整数monthで入力された整数に応じた結果を出力する
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("冬です");
			break;
		case 3: case 4: case 5:
			System.out.println("春です");
			break;
		case 6: case 7: case 8:
			System.out.println("夏です");
			break;
		case 9: case 10: case 11:
			System.out.println("秋です");
			break;
			
		default:
			System.out.println("無効な月です");
			
			
		}
	
       // スキャナーを使い終わったら閉じます（リソースの解放）
       sc.close();
	
	
	}
}
