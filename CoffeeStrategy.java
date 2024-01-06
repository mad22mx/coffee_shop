package Project;

interface CoffeeStrategy {
 void brew();
}

class EspressoStrategy implements CoffeeStrategy {
 @Override
 public void brew() {
     System.out.println("Brewing Espresso");
 }
}

class LatteStrategy implements CoffeeStrategy {
 @Override
 public void brew() {
     System.out.println("Brewing Latte");
 }
}

class AmericanoStrategy implements CoffeeStrategy {
	 @Override
	 public void brew() {
	     System.out.println("Brewing Americano");
	 }
	}

class CoffeeContext {
 private CoffeeStrategy strategy;

 public void setStrategy(CoffeeStrategy strategy) {
     this.strategy = strategy;
 }

 public void brewCoffee() {
     strategy.brew();
 }
}

