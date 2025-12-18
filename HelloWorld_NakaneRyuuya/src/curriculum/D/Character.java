package curriculum.D;

public class Character {


	protected int hp, at, sp;
	protected String name;
	
	// コンストラクタ
	public Character(int hp, int at, int sp) {
	this.hp = hp;
	this.at = at;
	this.sp = sp;
	}
	public String getName() {
		return name;
	}
	
    // ===================================
    // デバッグ用
    // ===================================
	
	public int getHp() {
		return hp;
	}
	public int getAt() {
		return at;
	}
	public int getSp() {
		return sp;
	}
}
