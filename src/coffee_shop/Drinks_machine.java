package coffee_shop;

import java.util.Scanner;

public class Drinks_machine {
	static Drinks_machine dm;
	private Drinks_machine() {
	}
	public static Drinks_machine get_instance() {
		if(dm == null) {
			dm = new Drinks_machine();
			return dm;
		}
		return dm;
	}
	
	public void receive_order() {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("Your order is being prepared . . . ");
		scan.close();
		Coffee ordered_coffee = choose_drink(s);
		ordered_coffee.make_coffee();
		
	}
	
	public Coffee choose_drink(String s) {
		switch(s) {
			case "1":
				return new Cappuccino();
			case "2":
				return new Latte();
			case "3":
				return new Frappuccino();
			case "4":
				return new Espresso();
			case "5":
				return new Americano();
			default:
				System.out.println("Wrong order.");
				return null;
		}
	}
	
}
