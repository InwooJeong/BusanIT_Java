package Exercise;

public class Div {
	private int a,b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int Calculate() {
		if(a>b) {
			return a/b;
		}else {
			return b/a;
		}
	}

}
