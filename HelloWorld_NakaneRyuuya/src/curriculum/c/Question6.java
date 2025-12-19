package curriculum.c;

public class Question6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	// プレイヤーとCPUと勝利判定を作成
	Player player = new Player();
	CPU cpu = new CPU();
	Judge judge = new Judge();
		
	// 勝つまで繰り返す	
	boolean win = false;
		
	while (!win) {
		
	// それぞれの手を取得
	int PlayerHand = player.getHand();
	int CpuHand = cpu.getHand();
			
	// 勝敗判定		
	win = judge.playRound(PlayerHand, CpuHand);
		System.out.println();
			
		}
		
	}

}
