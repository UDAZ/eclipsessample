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
class RemoteStaff extends Staff {
	String location;
	// クラス継承
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}
public class StaffInfo {
// ↓のメソッドの意味。他のクラスから呼び出せてクラスから直接呼び出せて返り値をもたないargsという配列型の引数を持つ
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff("Taro Yamada",123,"yamda@com");
		//yamada.name = "Taro Yamada";
		//yamada.sayhello();
		RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 1222, "tanaka@com");
		tanaka.location = "大阪";
		System.out.println("【社員情報】");
		System.out.println("氏名:" + yamada.getName());
		System.out.println("社員番号:" + yamada.getStaffid());
		System.out.println("メール:" + yamada.getEmail());
		
		System.out.println("【社員情報】");
		System.out.println("氏名:" + tanaka.getName());
		System.out.println("社員番号:" + tanaka.getStaffid());
		System.out.println("メール:" + tanaka.getEmail());
		System.out.println("勤務地:" + tanaka.location);
		// System.out.println(yamada.name);
	}

}

/*クラス継承を簡単に追加
 */
/* ソースのメニュータブ
 * スーパークラスからコンストラクターを作成
 */