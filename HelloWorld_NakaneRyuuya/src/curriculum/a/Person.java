package curriculum.a;

public class Person {
	
	// インスタンスフィールド
	private String name;
	private int age;
	private double height, weight;
	
	// 人数カウント用の変数
	private static int count = 0;
	
	// コンストラクタ
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	//人数カウント用	
		count++;
		
	}
	
	// BMIメソッド作成
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	
	// 出力内容メソッド作成
	public void print() {
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は" + this.age + "です");
	System.out.printf("BMIは%.2fです%n", this.bmi());
	}
	
	// 合計人数を返す
	public static int getCount() {
		return count;
	}
	
	
}
