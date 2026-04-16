/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.print("シトロン >");

		String str1 = reader.readLine();
		double num1 = Double.parseDouble(str1);

		System.out.print("ショコラ>");

		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);

		System.out.print("ピスターシュ>");

		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("\nシトロン     " + num1 + "個");
		System.out.println("ショコラ     " + num2 + "個");
		System.out.println("ピスターシュ " + num3 + "個");

		double totalBuyCount = num1 + num2 + num3;
		int totalPrice = (int) (250 * num1 + 280 * num2 + 320 * num3);

		System.out.println("\n合計個数    " + totalBuyCount + "個");
		System.out.println("合計金額  " + totalPrice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		ci = (int) (ci - num1);
		cy = (int) (cy - num2);
		p = (int) (p - num3);

		System.out.println("シトロン      \\250 ・・・残り" + ci + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + cy + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + p + "個");
		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("売上の割合");
		System.out.println("売上合計　　　\\" + totalPrice);
		System.out.println("内訳");
		System.out.println("シトロン　　  \\" + (int) (250 * num1) + "・・・" + (int) ((250 * num1) / totalPrice * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * num2) + "・・・" + (int) ((280 * num2) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * num3) + "・・・ " + (int) ((320 * num3) / totalPrice * 100) + "%");

	}

}
