package curriculum.d;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {
	
	// プレイヤーの名前
	private String name;
	
	// ランダム要素
	private static Random random = new Random();
	
	// コンストラクタ
	public Player() {
		super(random.nextInt(51) + 50, random.nextInt(10) + 7, random.nextInt(10));
		
	// 名前の入力
	Scanner scanner = new Scanner(System.in);
		System.out.print("プレイヤーの名前を入力してください:");
		this.name = scanner.nextLine();
		
		scanner.close();
	}			
	
	// 名前を取得
	public String getName() {
		return name;
			
	}

}
