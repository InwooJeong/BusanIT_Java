
public class EX04_01_Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;

	public static void main(String[] args) {
		EX04_01_Goods camera = new EX04_01_Goods();
		
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println("상품 이름 : " + camera.name);
		System.out.println("상품 가격 : " + camera.price);
		System.out.println("재고 수량 : " + camera.numberOfStock);
		System.out.println("팔린 수량 : " + camera.sold);
	}

}
