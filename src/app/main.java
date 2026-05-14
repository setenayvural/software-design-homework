package app;
import service.CampusFoodOrderService;
public class main {

	public static void main(String[] args) {
		CampusFoodOrderService service =
				new CampusFoodOrderService();
		service.placeOrder("Ali","Chicken Sandwich","EMAIL");
		System.out.println();
		service.placeOrder("Zeynep","Vegetarian Pizza","SMS");
		System.out.println();
		service.placeOrder("Omar","Coffee","PUSH");

	}

}
