package curriculum_B;

public class Animal {
	
	// 動物名
	private String name;
	
	// 体長
	private double height;
	
	// 速度
	private int speed;
	
	// 動物名をセット
	public void setName(String name) {
		this.name = name;
	}
	
	// 動物名を返す
	public String getName() {
		return this.name;
	}

	// 体長をセットする
	public void setHeight(double height) {
		this.height = height;
	}
	
	// 体長を返す
	public double getHeight() {
		return this.height;
	}
	
	// 速度をセットする
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 速度を返す
	public int getSpeed() {
		return this.speed;
	}
}
