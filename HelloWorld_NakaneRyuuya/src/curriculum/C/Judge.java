package curriculum.C;

public class Judge {

	// じゃんけんをして勝てば true で返す
	public boolean playRound(int  PlayerHand, int CpuHand) {
		
	// お互いの手を出力する	
		System.out.println("あなたの手 " + handToString(PlayerHand));
		System.out.println("CPUの手 " + handToString(CpuHand));
	
	// あいこの判定
	if (PlayerHand == CpuHand) {
		System.out.println("あいこです");
		return false;
	}
		
	// プレイヤーの勝ち判定
	if (
	   (PlayerHand == 0 && CpuHand == 1)||
	   (PlayerHand == 1 && CpuHand == 2)||
	   (PlayerHand == 2 && CpuHand == 0)
	   ) {
		
		System.out.println("あなたの勝ち");
		return true;
	}
	
	// それ以外は負け判定
		System.out.println("あなたの負け");
		return false;
	}
	
	// 数字を手に変換する
	private String handToString(int hand) {
		if(hand == 0) return "グー";
		if(hand == 1) return "チョキ";
					  return "パー";
	}
	
}
