package chap06.textbook.exercises.p18;

public class ShopService {

	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
	}
}
