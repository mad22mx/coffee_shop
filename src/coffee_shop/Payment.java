package coffee_shop;

public class Payment { // this is the class that gets adapted into the drinks machine class
	// a fuction that accepts card then checks with the bank that this card exists and has enough balance
	// then if those are true it deducts the price from the acc balance then returns payment successful or card decline
	// just to demonstrate we can make the card to be accepted as long as digit length is 16. else decline the card
	// and every true card has a balance of 982 dollar in it.
	
	// Function to process card payment
    public boolean processCardPayment(String cardNumber, double price) {
    	
        // Check card existence and balance with the bank
        // If card is valid, deduct the price from the account balance
        if (checkCardWithBank(cardNumber, price)) {
            deductAmountFromAccount(cardNumber, price);
            System.out.println("Payment successful!");
            return true;
        } else {
            System.out.println("Payment failed. Please check your card details"
            		+ " and and make sure that you have enough balance.");
            return false;
        }
    }

    // Function to check card with the bank
    private boolean checkCardWithBank(String cardNumber, double price) {
        // Perform a simple check for card validity as explained above
        if (cardNumber.length() == 16) {
        	// We assume that it existes
            return true;
        } else {
            System.out.println("Invalid card number. Please enter a valid 16-digit card number.");
            return false;
        }
    }

    // Function to deduct the amount from the account balance
    private void deductAmountFromAccount(String cardNumber, double price) {
        // Assuming each valid card has an initial balance of $982
        double initialBalance = 982.0;
        
        // Deduct the amount from the account balance
        double newBalance = initialBalance - (float)price;
        
        // Add your logic here to update the account balance in the bank records
        // For demonstration, let's just print the new balance
        System.out.println("Deducting $" + price + " from your account ");
        System.out.println("New account balance: $" + newBalance);
    }
}


	

