package curriculum.D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class Battle {

	
	private Player player;
	private Daemon daemon;
	
	// コンストラクタ
	public Battle(Player player, Daemon daemon) {
		this.player = player;
		this.daemon = daemon;
	}
	
	// バトル開始
	public void start() {
		
		
		System.out.println("Battle開始");
		
	// 先行・後攻を決める	
		Character attacker;
		Character defender;
		
		if(player.getSp() >= daemon.getSp()) {
			attacker = player;
			defender = daemon;
		} else {
			attacker = daemon;
			defender = player;
		}
		
	// 勝敗が決まるまでループ
		while (player.getHp() > 0 && daemon.getHp() > 0) {
			
	// 攻撃処理		
			System.out.println(attacker.getName() + "の攻撃 " + attacker.getAt() + "ダメージ");
			defender.hp -=attacker.getAt();
			
			System.out.println(defender.getName() + "残りHP: " + defender.getHp());
			
	// HPが0になったらループを終了		
		if (defender.getHp() <= 0) {
			break;
		}
		
	// 攻守交代
		Character change = attacker;
		attacker = defender;
		defender = change;
		}
		
	// 勝者決定
		Character winner;;
		
	// 勝敗の表示
		if (player.getHp() > 0) {
		    winner = player;
		} else {
		    winner = daemon;
		}

		System.out.println(winner.getName() + " の勝利！");

	// バトル結果をログに書き出す
		try {
		    List<String> log = List.of("勝者: " + winner.getName(),"Player HP: " + player.getHp(),"Daemon HP: " + daemon.getHp() );

		    Files.write(Paths.get("battle_log.txt"),log,
		        StandardOpenOption.CREATE,
		        StandardOpenOption.TRUNCATE_EXISTING
		    );

	// エラー時の処理
		} catch (IOException e) {
		    System.out.println("ログの生成に失敗しました。" + e.getMessage());
		
		}
	}
}
