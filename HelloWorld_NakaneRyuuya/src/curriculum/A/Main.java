package curriculum.A;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 人を作成し情報を入れる
		Person person1 = new Person("中根龍哉", 23, 1.6, 60);
		
		// 1人目を出力する
		person1.print();
	
		// 合計人数を出力する
		System.out.println("合計" + Person.getCount() + "人です");
		
	}
}
