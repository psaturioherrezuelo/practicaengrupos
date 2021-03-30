package pelea_de_dados;

public class Dado {
	private int num;
	private String cara;
	
	public Dado() {
		
		num = (int) (Math.random()*6)+1;
		
		switch (num) {
		
		case 1:
			cara = "---------"
				+  "-       -"
				+  "-   *   -"
				+  "-       -"
				+  "---------";
			break;
		case 2:
			cara = "---------"
					+  "-       -"
					+  "- *   * -"
					+  "-       -"
					+  "---------";
			break;
		case 3:
			cara = "---------"
					+  "-   *   -"
					+  "-       -"
					+  "- *   * -"
					+  "---------";
			break;
		case 4:
			cara = "---------"
					+  "- *   * -"
					+  "-       -"
					+  "- *   * -"
					+  "---------";
			break;
		case 5:
			cara = "---------"
					+  "- *   * -"
					+  "-   *   -"
					+  "- *   * -"
					+  "---------";
			break;
		case 6:
			cara = "---------"
					+  "- *   * -"
					+  "- *   * -"
					+  "- *   * -"
					+  "---------";
			break;
		
		}
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCara() {
		return cara;
	}

	public void setCara(String cara) {
		this.cara = cara;
	}

	@Override
	public String toString() {
		return cara;
	}
}
