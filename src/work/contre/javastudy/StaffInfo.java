package work.contre.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello(){
		System.out.println("Hello " + this.name);
	}
}

public class StaffInfo {
// ↓のメソッドの意味。他のクラスから呼び出せてクラスから直接呼び出せて返り値をもたないargsという配列型の引数を持つ
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		yamada.sayhello();
		// System.out.println(yamada.name);
	}

}
