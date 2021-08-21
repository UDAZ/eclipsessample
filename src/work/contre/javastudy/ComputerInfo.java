package work.contre.javastudy;

class Computer{
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer desktop = new Computer();
		desktop.os = "windows10";
		desktop.memory = 4;
		desktop.storage = 256;
		
		System.out.println("OS:" + desktop.os);
		System.out.println("メモリ:" + desktop.memory + "GB");
		System.out.println("ストレージ:" + desktop.storage + "GB");
		
		Computer desktop2 = desktop; // desktopインスタンスを参照している
		desktop2.os = "ubuntu"; // ubuntuに変更されている
		
		System.out.println("\nOS:" + desktop2.os);
		System.out.println("メモリ:" + desktop2.memory + "GB");
		System.out.println("ストレージ:" + desktop2.storage + "GB");
	}

}

// あるインスタンスのメモリー領域を効率よく扱える