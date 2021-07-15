
public class EX03_09_foreachEx {
	enum Week{월,화,수,목,금,토,일}

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;

		for(int k:num) {
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		for(String s:names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) {
			System.out.print(day+"요일\t");
		}
		System.out.println();
			
	}

}
