package curriculum.D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Daemon extends Character{
	
	// デーモンの名前
	private String name;
	
	// コンストラクタ
	public Daemon() {
		super(0,0,0);
		this.name = "";
	}

	// 名前を取得
	public String getName() {
		return name;
	}
	
	// ファイルから情報を読み込む
	public void loadDaemon() {
		
		
		try {
		
	// ファイルの中身を行として読み取る
		List<String> lines = Files.readAllLines(Paths.get("daemon_status.txt"));
			
	// 設定したものを割り当てる
		this.name = lines.get(0);
		this.hp = Integer.parseInt(lines.get(1));
		this.at = Integer.parseInt(lines.get(2));
		this.sp = Integer.parseInt(lines.get(3));

	// エラー時の処理	
		} catch (IOException e) {
			System.out.println("ファイルが見つかりません: " + e.getMessage());

		
		} catch (NumberFormatException e) {
			System.out.println("値が正しくありません: " + e.getMessage());

		
		} catch (IndexOutOfBoundsException e) {
			System.out.println("テキストファイルの行数の不一致");


		}
	}
	
}
