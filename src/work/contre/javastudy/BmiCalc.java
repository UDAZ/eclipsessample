package work.contre.javastudy;

public class BmiCalc {
/* BMIを計算するプログラム
 * BMI = 体重 / (身長 *  身長)
 * 体重 kg 、 身長 m
 * 
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		weight = 71;
		height = 1.8;
		bmi = weight / (height * height);
		
		System.out.println(bmi);
	}

}
