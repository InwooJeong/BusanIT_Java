package Exercise;

public class Rectangle {
	int x,y,width,height;
	
	Rectangle(){
		
	}
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"X"+height+"�� �簢��");
	}
	
	

}
