import java.util.Scanner;

/**
 * 電卓クラス
 * 
 */
class Calculator {

    /**
     * 足し算した結果を返却
     * 
     * @param x
     * @param y
     * @return xとyの加算値
     */
	int calcSum(int x, int y) {
        return x + y;
    }

    /**
     * 平均値を算出して返却
     * 
     * @param x
     * @param y
     * @return xとyの平均値
     */
	int calcAve(int x, int y) {
        return (x + y)/2;
    }

}

/**
 * 拡張電卓クラス
 * 
 */
class Morecalc extends Calculator {
    /**
     * 累乗を算出して返却
     * 
     * @param x
     * @param y
     * @return xとyの累乗
     */
    int calcPow(int x, int y) {
        return x * y;
    }
}

/**
 * メイン処理クラス
 */
public class M12_1 { 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // メインクラスの生成とメイン処理実行
		class mein{

        }

        // 拡張電卓インスタンス生成
		//(__x__)

    	// 合計値
		//(__x__)

		// 平均値
   // 	(__x__)

    	// 累乗
//		(__x__)

      stdIn.close();
    }
}