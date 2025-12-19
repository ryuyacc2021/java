package curriculum.c;

import java.util.Random;

public class CPU {

	// ランダム生成用
	private Random random = new Random();
	
	// CPUの手をランダムに決める
	public int getHand() {
		return random.nextInt(3);
	}
}
