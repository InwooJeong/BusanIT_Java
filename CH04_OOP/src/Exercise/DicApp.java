package Exercise;
import java.util.*;

public class DicApp {
	
	DicApp(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷�(���� �� �׸�) >>");
		
		while(true) {
			System.out.println("�ѱ� �ܾ�?(���� �� �׸�)>>");
			String s = sc.next();
			
			String eng = Dictionary.kor2Eng(s);
			if(s.equals("�׸�")) {
				break;
			}
			if(eng.equals("f")) {
				System.out.println(s+"��/�� �� ������ �����ϴ�.");
			}else {
				System.out.println(eng);
			}
		}
	}
}
