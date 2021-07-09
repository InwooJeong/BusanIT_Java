package Exercise;

public class EX04_04 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());

	}

}
