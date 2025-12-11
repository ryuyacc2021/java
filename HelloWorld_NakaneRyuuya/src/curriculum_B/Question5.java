package curriculum_B;

public class Question5 {
	
    public static void main(String[] args) {

    // ===================================
    // 問１
    // ===================================
     
    // メソッドを呼び出して出力する	
    	helloWorld();
   
    // ===================================
    // 問２
    // ===================================
      
    // 変数を宣言して値を代入
      int num = 10;
      
    // メソッドを呼び出して2倍の値を取得
      int result = doubleValue(num);
    
    // 結果を出力する
        System.out.println(num + "を2倍にすると" + result + "です。");
        
    // ===================================
    // 問３
    // ===================================   
      
    // 変数を宣言して値を代入  
      int num1 = 7;
      
    // 変数を宣言して値を代入
      int num2 = 10;
       
    // isEven メソッドに値を渡し、偶数なら true、奇数なら false が返る   
      boolean result1 = isEven(num1);
      boolean result2 = isEven(num2);
        
      
      if(result1) {
    	  System.out.println(num1 + "は偶数です。");
      } else {
    	  System.out.println(num1 + "は奇数です。");
      }
      
      
      if(result2) {
    	  System.out.println(num2 + "は偶数です。");
      } else {
    	  System.out.println(num2 + "は奇数です。");
      }       
 
    
    // ===================================
    // 問４
    // ===================================     
    
	// Greetingからオブジェクトを作成	
    Greeting greeting = new Greeting();
    
    // 呼び出し
    greeting.sayHello();
    
        
    
    // ===================================
    // 問５
    // ===================================    
    
    // Animalからオブジェクトを作成
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
    // ===================================
    // 問１ メソッド
    // ===================================
   
    public static void helloWorld() {
        System.out.println("Hello,World");
    }

    // ===================================
    // 問２ メソッド
    // ===================================
    
    public static int doubleValue(int num) {
        return num * 2;
    }    
        
    // ===================================
    // 問３ メソッド
    // ===================================     

    public static boolean isEven(int num) {
    	return num % 2 == 0;
    }


}
