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
		System.out.println("("+x+","+y+")에서 크기가 "+width+"X"+height+"인 사각형");
	}
	
	

}
