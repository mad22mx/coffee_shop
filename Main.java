package Project;

public class Main {

	public static void main(String[] args) {

		// Using Factory Pattern for Ordering
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.prepare();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        latte.prepare();
        
        CoffeeFactory americanoFactory = new AmericanoFactory();
        Coffee americano = americanoFactory.createCoffee();
        americano.prepare();

        // Using Singleton Pattern for DrinksMachine
        DrinksMachine drinksMachine = DrinksMachine.getInstance();
        drinksMachine.start();

        // Using Strategy Pattern for Creating Different Kinds of Coffee
        CoffeeContext coffeeContext = new CoffeeContext();

        coffeeContext.setStrategy(new EspressoStrategy());
        coffeeContext.brewCoffee();

        coffeeContext.setStrategy(new LatteStrategy());
        coffeeContext.brewCoffee();
        
        coffeeContext.setStrategy(new AmericanoStrategy());
        coffeeContext.brewCoffee();
	}

}
