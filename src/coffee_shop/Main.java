package coffee_shop;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome!");
		System.out.println("What would you like to have today?");
		System.out.println("Click 1 for Cappuccino");
		System.out.println("2 for Latte");
		System.out.println("3 for Frappuccino");
		System.out.println("4 for Espresso");
		System.out.println("5 for Americano");
		System.out.println("0 for confirm");

		Drinks_machine dm = Drinks_machine.get_instance();
		dm.receive_order();
		
	}
}
