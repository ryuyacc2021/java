package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 変数宣言、初期値の設定
		byte byteNum =0;
		short shortNum =0;
		int intNum =0;
		long longNum =0L;
		float floatNum =0.0f;
		double doubleNum =0.0;
		char letter ='\u0000';
		String letters ="null";
		boolean isBoolean =false;
		
		// 変数に値を代入
		byteNum =10;
		shortNum =100;
		intNum =1000;
		longNum =10000;
		floatNum =9.5f;
		doubleNum =10.5;
		letter ='a';
		letters ="ハロー";
		isBoolean =true;
		
		// 結果を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println((int)(floatNum + doubleNum));
		System.out.println(letter +" "+ letters +" "+ isBoolean);
		
		System.out.println((int)(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		// String型の変数宣言し名前を代入
		String name = "山田太郎";
		
		// 結果を出力する
		System.out.println("こんにちは、" +name+ "さん！");
		
		//Int型の変数宣言と初期値の設定し出力
		int age=25;
		System.out.println("年齢:" +age+ "歳");
		
		// num1に10を代入num2に5を代入
		int num1 =10, num2 =5;
		
		// 2つを足した結果をsumという変数に代入
		int sum = num1 + num2;
		
		//2つを足した結果をsumという変数に代入するし出力
		System.out.println(sum);
		
		//Int型の変数宣言し、80を代入してから自己代入で20を加えてから出力
		int score =80;
		score +=20;
		System.out.println("最終スコア:" +score);
		
		//Double型の変数を宣言し値を代入
		double price =99.99;
		
		// Int型変数に手動変換
		int Price = (int)price;
		
		//結果を出力する
		System.out.println("整数価格:" +Price);
		
		//String型の変数を宣言
		String numStr = "123";
		
		// オブジェクトをInt型に変換
		int NumStr = Integer.parseInt(numStr);
		
		// そこから10を足した値を出力する
		System.out.println(NumStr + 10);
		
		//Int型の変数に50を代入
		int num = 50;
		
		// 変数をオブジェクトに変換
		String Num = String.valueOf(num);
		
		//結果を出力する
		System.out.println("得点:" +Num + "点");
		
		// Int型の変数aに10、bに20を代入
		int a = 10, b = 20;
		
		// aがbより小さいかどうかを条件演算子で判定、resultに代入して
		boolean result = (a < b);
		
		// 結果を出力する
		System.out.println(result);
		
		// Int型の変数に15を代入
		int x =15;
		
		// 三項演算子で条件判定し、結果を文字列として代入
		String Result = (x >= 10) ? "OK" : "NG";
		
		// 結果を出力する
		System.out.println(Result);
		
		// 文章を変数textに代入
		String text = "私はJavaが好きです。Javaは楽しい！";
		
		// JavaをPythonに置き換える
		String Text = text.replace("Java", "Python");
		
		// 結果を出力
		System.out.println(Text);
		
			}

}
