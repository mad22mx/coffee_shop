package coffee_shop;

public class Cappuccino implements Coffee{

	@Override
	public void make_coffee() {
		System.out.println("Your Cappuccino is ready, Enjoy!");
		
	}
	@Override
	public String toString() {
		return "Cappuccino";
	}

}
