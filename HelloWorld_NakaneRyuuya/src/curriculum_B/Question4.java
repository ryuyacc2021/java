package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	// =====================================
	// 問題１
	// =====================================	
	
	// 配列を用意
	int[] numbers = {1, 2 , 3, 4, 5};
	
	// 配列の中身を順に出力する
	for(int a = 0 ; a <= 4 ; a++) {
		System.out.println(numbers[a]);
	}
		
	
	// =====================================
	// 問題２
	// =====================================
	
	// 配列を用意
	int[] numbers2 = {10, 20, 30, 40, 50};
	
	// 配列の中身を逆に出力する
	for(int b = 4 ; b >= 0 ; b--) {
		System.out.println(numbers2[b]);
	}

	
	// =====================================
	// 問題３
	// =====================================
	
	// 配列を用意
	int[] numbers3 = {3, 5, 7, 9, 11};
	
	// 合計を入れる変数
	int sum = 0;
	
	// 配列の中身を順番に足す
	for(int c = 0; c < numbers3.length; c++) {
		sum += numbers3[c];
	}
	
	// 結果を出力する
	   System.out.println(sum);
	
	
	// =====================================
	// 問題４
	// =====================================
	
	// 配列を用意
	int[] numbers4 = {12, 7, 9, 21, 5, 18};
	
	// 最初の要素を最大・最小の基準にする
	int max = numbers4[0];
	int min = numbers4[0];
	
	// 配列の2番目から最大値と最小値をチェック
	for(int d = 1; d < numbers4.length; d++) {
		
		if(numbers4[d] > max) {
			max = numbers4[d];
		}
		
		if(numbers4[d] < min) {
			min = numbers4[d];
		}
	}
	
	// 結果を出力する
		System.out.println(max);
		System.out.println(min);
	
	// =====================================
	// 問題５
	// =====================================
	
	// 配列を用意
	int[] numbers5 = {1, 2, 3, 4, 5};
	
	// 拡張for文を使用して中身を順番に2倍で出力する
	for(int num : numbers5) {
		System.out.println(num * 2);
		
	}
	
	// =====================================
	// 問題６
	// =====================================
	
    // 配列を用意
    int[] numbers6 = {4, 7, 10, 15, 20};

    // 検索用フラグ
    boolean found = false;

    // Scannerオブジェクトを作成し、入力を読み取れるように設定
    Scanner sc = new Scanner(System.in);

    // 数値を入力してもらう
    System.out.print("数値を入力してください：");
    int input = sc.nextInt();
	
    // 配列の中を1つずつ確認
    for(int e = 0; e < numbers.length; e++) {
    	
    // 配列の要素と同じ値ならっループ終了
    	if(numbers6[e] == input) {
    		found = true;
    		break;
    	}
    	
    }
    
    // 検索フラグを使用して結果を出力する
    if(found) {
    	System.out.println("入力した値は配列に含まれています");
    } else {
    	System.out.println("入力した値は配列に含まれていません");
    }
   
    // スキャナーを閉じる
    sc.close();
    
    
	// =====================================
	// 問題７
	// =====================================  
    
    // 配列を用意
    int[][] array = {
    	{1, 2}, 
    	{3, 4}, 
    	{5, 6}
    };
    
    for(int f = 0; f < array.length; f++) {
    	for(int g = 0; g < array[f].length; g++) {
    	System.out.print(array[f][g] + " ");
    	}
    	System.out.println();
    
    }
    
	// =====================================
	// 問題８
	// =====================================  
 
    // 配列を用意
    int[][] array8 = {
    	{10, 20, 30}, 
    	{40, 50, 60}, 
    	{70, 80, 90}
    };
    
    // 合計を入れる変数
    int sum2 = 0;
    
    // 行と列のループ処理
    for(int h = 0; h < array8.length; h++) {
    for(int i = 0; i < array8[h].length; i++) {
    	
    // 値をsum2に足す
    	sum2 += array8[h][i];
    
    	}
    
    }
    
    // 結果を出力する
    	System.out.println(sum2);
    
    // =====================================
    // 問題９
    // ===================================== 
    
    // 配列を用意
    int[][] array9 = {
    	{12, 15, 8},
    	{6, 19, 25}, 
    	{30, 2, 10}
    };
    
    // 最初の要素を最大・最小の基準にする
	int max2 = array9[0][0];
	int min2 = array9[0][0];
    
	// 配列を全てチェック
    for(int j = 0; j < array9.length; j++) {
    for(int k = 0; k < array9[j].length; k++) {
    	
    // 最大値をチェック
		if(array9[j][k] > max2) {
			max2 = array9[j][k];
		}
		
	// 最小値をチェック
		if(array9[j][k] < min2) {
			min2 = array9[j][k];
			}
		
    	}
    
    }
    
	// 結果を出力する
		System.out.println(max2);
		System.out.println(min2);
    
	 // =====================================
	 // 問題１０
	 // ===================================== 		
	
	// 3次元配列を用意
	int[][][] array10 = {
		{{1, 2}, {3, 4}},
		{{5, 6}, {7, 8}}
	};
	
	// 3重ループですべて表示
	for(int l = 0; l < array10.length; l++) {
	for(int n = 0; n < array10[l].length; n++) {
	for(int m = 0; m < array10[l][n].length; m++) {
		System.out.print(array10[l][n][m] + " ");
				
			}
	// 改行
		System.out.println();
		}
	// 改行
		System.out.println();
	}
	
    
	}

}
