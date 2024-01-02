package coffee_shop;
import java.util.*;
public class Main {
	static String[] options = {"Cappuccino","Latte","Frappuccino","Espresso"
		                                            ,"Americano"};
	public static void main(String[] args) {
		Drinks_machine machine = Drinks_machine.getInstance();
		for(int i = 0; i < options.length;i++)
			machine.addOption(options[i]);
		machine.recieveOrder();
	}
	
	

}
