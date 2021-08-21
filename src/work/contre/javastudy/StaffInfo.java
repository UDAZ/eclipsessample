package work.contre.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello(){
		System.out.println("Hello " + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class StaffInfo {
// ↓のメソッドの意味。他のクラスから呼び出せてクラスから直接呼び出せて返り値をもたないargsという配列型の引数を持つ
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff("Taro Yamada",123,"yamda@com");
		//yamada.name = "Taro Yamada";
		//yamada.sayhello();
		System.out.println("【社員情報】");
		System.out.println("氏名:" + yamada.getName());
		System.out.println("社員番号:" + yamada.getStaffid());
		System.out.println("メール:" + yamada.getEmail());
		// System.out.println(yamada.name);
	}

}

/*getメソッドとsetメソッドを簡単に追加
 */
/* ソースのメニュータブ
 * getterおよびsetterの生成
 */