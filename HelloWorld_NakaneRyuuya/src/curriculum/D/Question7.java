package curriculum.D;

public class Question7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
       
		
		Player player = new Player();

		
        Daemon daemon = new Daemon();
        daemon.loadDaemon();

        
        Battle battle = new Battle(player, daemon);
        battle.start();
	}

}
