package pelea_de_dados;

public class Dados {

	private int num;
	private String cara;
	
	public Dados() {
		
		num = (int) (Math.random()*6)+1;
		
		switch (num) {
		
		case 1:
			cara = "---------\n"
				+  "-       -\n"
				+  "-   *   -\n"
				+  "-       -\n"
				+  "---------";
			break;
		case 2:
			cara = "---------\n"
					+  "-       -\n"
					+  "- *   * -\n"
					+  "-       -\n"
					+  "---------";
			break;
		case 3:
			cara = "---------\n"
					+  "-   *   -\n"
					+  "-       -\n"
					+  "- *   * -\n"
					+  "---------";
			break;
		case 4:
			cara = "---------\n"
					+  "- *   * -\n"
					+  "-       -\n"
					+  "- *   * -\n"
					+  "---------";
			break;
		case 5:
			cara = "---------\n"
					+  "- *   * -\n"
					+  "-   *   -\n"
					+  "- *   * -\n"
					+  "---------";
			break;
		case 6:
			cara = "---------\n"
					+  "- *   * -\n"
					+  "- *   * -\n"
					+  "- *   * -\n"
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
