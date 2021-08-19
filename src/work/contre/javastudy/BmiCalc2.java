package work.contre.javastudy;

import java.util.Scanner;
public class BmiCalc2 {
/* BMIを計算するプログラム
 * BMI = 体重 / (身長 *  身長)
 * 体重 kg 、 身長 cm
 * 
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		//weight = 71;
		//height = 180;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？(kg)：");
		weight = stdIn.nextDouble();
		System.out.println("身長は？(cm)：");
		height = stdIn.nextDouble();		
		
		height /= 100; // 代入演算子 X = X /Y などの状況の際に使える
		bmi = weight / (height * height);
		
		System.out.println("BMI: " + bmi + "です。");
		
		if (bmi < 18.5) {
			System.out.println("やせ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}
	}

}
