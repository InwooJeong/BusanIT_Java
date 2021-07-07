
public class EX04_02_MyExp {
	int base;
	int exp;
	int getValue() {
		int res = 1;
		for(int i=0;i<exp;i++) {
			res = res*base;
		}
		return res;
	}

	public static void main(String[] args) {
		EX04_02_MyExp number1 = new EX04_02_MyExp();
		number1.base = 2;
		number1.exp = 3;
		
		EX04_02_MyExp number2 = new EX04_02_MyExp();
		number2.base = 3;
		number2.exp = 4;
		
		System.out.println("2ÀÇ 3½Â = " + number1.getValue());
		System.out.println("3ÀÇ 4½Â = " + number2.getValue());
	}

}
