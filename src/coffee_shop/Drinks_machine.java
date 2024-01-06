package coffee_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drinks_machine {
	static Drinks_machine dm;
	private Drinks_machine() {}
	
	public static Drinks_machine get_instance() {
		if(dm == null) {
			dm = new Drinks_machine();
			return dm;
		}
		return dm;
	}
	
	public void receive_order() {
		
		Scanner scan = new Scanner(System.in);
		List<Coffee> chooseCoffees = new ArrayList<>();
        int choice;
        do {
            choice = scan.nextInt();

            if (choice >= 1 && choice <= 5) {
                Coffee chooseCoffee = choose_drink(choice);
                chooseCoffees.add(chooseCoffee);
                System.out.println("Added " + chooseCoffee.toString() + " to your order.");
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please choose between 1 to 5. Or 0 to confirm your order.");
            }
        } while (choice != 0);
        
        boolean isPaymentAccepted = false;
		if(chooseCoffees.size() > 0) {
			PaymentAdapter paymentAdapter = new PaymentAdapter();
			System.out.print("Please enter your card no.(16 digits): ");
			String cardNumber = scan.next();
			isPaymentAccepted = paymentAdapter.processPayment(cardNumber, chooseCoffees.size()*9); // one coffee price is $9
		}
		
		scan.close();
		
		if(chooseCoffees.size() > 1 && isPaymentAccepted) {
			System.out.println("Your order is being prepared . . . ");
			for (Coffee coffee : chooseCoffees) {
	            coffee.make_coffee();;
	        }
		} else { 
			System.out.println("Empty order");
		}
        
    }
	
	
	public Coffee choose_drink(int s) {
		switch(s) {
			case 1:
				return new Cappuccino();
			case 2:
				return new Latte();
			case 3:
				return new Frappuccino();
			case 4:
				return new Espresso();
			case 5:
				return new Americano();
			default:
				System.out.println("Wrong order.");
				return null;
		}
	}
	
}


interface PaymentInterface {
	boolean processPayment(String cardNumber, double amount);
}

//Adapter class to adapt Payment with the rest of our code
class PaymentAdapter implements PaymentInterface {
	private Payment payment;

	public PaymentAdapter() {
		this.payment = new Payment();
 
	}

 	public boolean processPayment(String cardNumber, double amount) {
		// Call the existing Payment class method
		return payment.processCardPayment(cardNumber, amount);
	}

}


