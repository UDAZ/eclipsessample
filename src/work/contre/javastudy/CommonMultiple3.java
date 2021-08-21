package work.contre.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 2と3の公倍数以外を表示する
		int i = 1;
		while(i < 20) {
			if(!((i % 2 == 0) && (i % 3 == 0))) { // NOT演算子
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
