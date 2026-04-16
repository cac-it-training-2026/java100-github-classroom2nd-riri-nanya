/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		System.out.println("ピスターシュ  \\" + (int) (320 * num3) + "・・・ " + ((320 * num3) / totalPrice * 100) + "%");

		System.out.println("明日の三色マカロンの配合率が決まりました！");
		System.out.println("シトロンの味    ・・・" + (int) ((250 * num1) / totalPrice * 100) + "%");
		System.out.println("ショコラの味　　・・・" + (int) ((280 * num2) / totalPrice * 100) + "%");
		System.out.println("ピスターシュの味　・・・" + (int) ((320 * num3) / totalPrice * 100) + "%");
		System.out.println("が楽しめます！");
		System.out.println("値段は\270です。");
		System.out.println("\n値段は\\" + ((totalPrice / (int) totalBuyCount) / 10 * 10) + "です。");
		//まず１０で割って１の位切り捨て、それで１０掛けたら（例１２＊１００）で１２０になる。
	}

}
