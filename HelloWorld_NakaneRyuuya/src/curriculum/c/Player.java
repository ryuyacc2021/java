package curriculum.c;

import java.util.Scanner;

public class Player {

	// キーボード入力をできるようにする
	private Scanner scanner = new Scanner(System.in);
	
	// プレイヤーが手を入力
	public int getHand() {
		System.out.print("グー(0), チョキ(1), パー(2)を入力: ");
		return scanner.nextInt();
	}
	
	
}
