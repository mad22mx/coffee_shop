package Drinks_Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Coffee interface with Strategy DP
interface Coffee {
    void get_ready();
}

// Types of Coffee 
class Latte implements Coffee {
    @Override
    public void get_ready() {
        System.out.println("Latte coffee is ready");
    }
}

class Americano implements Coffee {
    @Override
    public void get_ready() {
        System.out.println("Americano coffee is ready");
    }
}

class Cappuccino implements Coffee {
    @Override
    public void get_ready() {
        System.out.println("Cappuccino coffee is ready");
    }
}

class Frappuccino implements Coffee {
    @Override
    public void get_ready() {
        System.out.println("Frappuccino coffee is ready");
    }
}

class Espresso implements Coffee {
    @Override
    public void get_ready() {
        System.out.println("Espresso coffee is ready");
    }
}

// Drinks_Machine class with Singleton DP
class Drinks_Machine {
    private static Drinks_Machine dp;

    private Drinks_Machine() {
        // Private constructor to prevent instantiation
    }

    public static Drinks_Machine getdp() {
        if (dp == null) {
            dp = new Drinks_Machine();
        }
        return dp;
    }

    public void bringCoffee(Coffee coffee) {
        coffee.get_ready();
    }
}

// Main function with Factory DP
public class Main {
    public static void main(String[] args) {
        Drinks_Machine drinks_Machine = Drinks_Machine.getdp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your coffee (enter 0 to finish):");
        System.out.println("1. Latte");
        System.out.println("2. Americano");
        System.out.println("3. Cappuccino");
        System.out.println("4. Frappuccino");
        System.out.println("5. Espresso");

        List<Coffee> chooseCoffees = new ArrayList<>();
        int choice;

        do {
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                Coffee chooseCoffee;
                switch (choice) {
                    case 1:
                        chooseCoffee = new Latte();
                        break;
                    case 2:
                        chooseCoffee = new Americano();
                        break;
                    case 3:
                        chooseCoffee = new Cappuccino();
                        break;
                    case 4:
                        chooseCoffee = new Frappuccino();
                        break;
                    case 5:
                        chooseCoffee = new Espresso();
                        break;
                    default:
                        continue;
                }

                chooseCoffees.add(chooseCoffee);
                System.out.println("Added " + chooseCoffee.getClass().getSimpleName() + " to your order.");
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please choose between 1 to 5.");
            }
        } while (choice != 0);

        // Strategy pattern applied through the Coffee interface
        System.out.println("Your order is accepted. You chose the following drinks:");
        for (Coffee coffee : chooseCoffees) {
            drinks_Machine.bringCoffee(coffee);
        }
    }
}
