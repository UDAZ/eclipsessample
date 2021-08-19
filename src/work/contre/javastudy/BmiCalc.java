package work.contre.javastudy;

public class BmiCalc {
/* BMIを計算するプログラム
 * BMI = 体重 / (身長 *  身長)
 * 体重 kg 、 身長 cm
 * 
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		weight = 71;
		height = 180;
		height /= 100; // 代入演算子 X = X /Y などの状況の際に使える
		bmi = weight / (height * height);
		
		System.out.println(bmi);
	}

}
