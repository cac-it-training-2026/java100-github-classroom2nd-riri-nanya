/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

		public static void main(String[] args) throws IOException {

			System.out.println("たいへんお待たせしました。");
			System.out.println("【ポエール・ネルメ】");
			System.out.println("ただいまより開店です！！");

			int ci = 30;
			int cy = 30;
			int p = 30;

			System.out.println("\n本日のおすすめ商品です。\n");
			System.out.println("シトロン      \\250 ・・・ 残り" + ci + "個");
			System.out.println("ショコラ      \\280 ・・・ 残り" + cy + "個");
			System.out.println("ピスターシュ  \\320 ・・・ 残り" + p + "個");

			System.out.println("\n7それぞれ何個ずつかいますか？");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("シトロン >");

			String str1 = reader.readLine();
			int num1 = Integer.parseInt(str1);

			System.out.println("ショコラ>");

			String str2 = reader.readLine();
			int num2 = Integer.parseInt(str2);

			System.out.println("ピスターシュ>");

			String str3 = reader.readLine();
			int num3 = Integer.parseInt(str3);

			System.out.println("\nシトロン     " + num1 + "個");
			System.out.println("ショコラ     " + num2 + "個");
			System.out.println("ピスターシュ " + num3 + "個");

			
			System.out.println("合計個数"+num1+num2+num3+"個");
			
			
			System.out.println();
			
			System.out.println("\nをお買いあげですね。");
			System.out.println("承りました。");

		}

	}

}
