package curriculum.D;

// ===================================
// デバッグ用クラス
// ===================================

public class TestRead {

    public static void main(String[] args) {

        // Player生成（名前入力＋ランダム）
        Player player = new Player();

        // Daemon生成＋ファイル読込
        Daemon daemon = new Daemon();
        daemon.loadDaemon();

        // Playerの確認
        System.out.println("名前: " + player.getName());
        System.out.println("HP: " + player.getHp());
        System.out.println("AT: " + player.getAt());
        System.out.println("SP: " + player.getSp());

        // Daemonの確認
        System.out.println("名前: " + daemon.getName());
        System.out.println("HP: " + daemon.getHp());
        System.out.println("AT: " + daemon.getAt());
        System.out.println("SP: " + daemon.getSp());
    }
}