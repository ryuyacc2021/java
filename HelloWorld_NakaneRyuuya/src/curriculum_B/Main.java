package curriculum_B;

public class Main {

    public static void main(String[] args) {
    	
    	// Greetingのオブジェクトを作成	
        Greeting greeting = new Greeting();
        
        // 呼び出し
        greeting.sayHello();
        
        // Animalのオブジェクトを作成
        Animal lion = new Animal();
        
        // フィールド値を設定
        lion.setName("ライオン");
        lion.setHeight(2.1);
        lion.setSpeed(80);
        
        
        // 呼び出し
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getHeight() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
        
        
        
        
    }
}
