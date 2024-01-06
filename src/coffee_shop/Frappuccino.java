package coffee_shop;

public class Frappuccino implements Coffee {

	@Override
	public void make_coffee() {
		System.out.println("Your Frappuccino is ready, Enjoy!");
		
	}
	@Override
	public String toString() {
		return "Frappuccino";
	}

}
