package work.contre.javastudy;

public class CommonMultiple2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 2または3の倍数を1から50未満の範囲で表示するプログラム
		int i = 1;
		while(i < 50) {
			if((i % 2 == 0) || (i % 3 == 0)) { // 論理和
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}
	}

}

/*6
12
18
24
30
36
42
48
54
60
66
72
78
84
90
96
*/
