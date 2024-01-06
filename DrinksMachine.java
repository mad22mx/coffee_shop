package Project;

//Singleton class for DrinksMachine
class DrinksMachine {
 private static DrinksMachine instance;

 private DrinksMachine() {
 }

 public static DrinksMachine getInstance() {
     if (instance == null) {
         instance = new DrinksMachine();
     }
     return instance;
 }

 public void start() {
     System.out.println("Drinks machine is starting...");
 }

}
