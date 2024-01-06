package Project;

//Product interface
interface Coffee {
 void prepare();
}

class Espresso implements Coffee {
 @Override
 public void prepare() {
     System.out.println("Preparing Espresso");
 }
}

class Latte implements Coffee {
 @Override
 public void prepare() {
     System.out.println("Preparing Latte");
 }
}

class Americano implements Coffee {
	 @Override
	 public void prepare() {
	     System.out.println("Preparing Americano");
	 }
	}

interface CoffeeFactory {
 Coffee createCoffee();
}

class EspressoFactory implements CoffeeFactory {
 @Override
 public Coffee createCoffee() {
     return new Espresso();
 }
}

class LatteFactory implements CoffeeFactory {
 @Override
 public Coffee createCoffee() {
     return new Latte();
 }
}

class AmericanoFactory implements CoffeeFactory {
	 @Override
	 public Coffee createCoffee() {
	     return new Americano();
	 }
	}

