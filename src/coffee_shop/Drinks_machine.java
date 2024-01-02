package coffee_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Drinks_machine {
   private static Drinks_machine instance;
   private static ArrayList<String> options; 
		                      
              

   private Drinks_machine()
   {
	   options = new ArrayList<String>();
   }
   
   public static Drinks_machine getInstance() 
   {
	   if(instance == null) 
	   {
		   instance = new Drinks_machine();
	   }
	   return instance;
   }
   
   public void recieveOrder()
   {
	   Coffee coffee = getCoffee(options.get(choose()));
	   if(coffee != null)
		   coffee.make_coffee();
	   
		   }
   
   private Coffee getCoffee(String str)
   {
	   Coffee order = null ;
	   if(str.equalsIgnoreCase("americano"))
		   order = new Americano();
	   
	   if(str.equalsIgnoreCase("Espresso"))
		   order = new Espresso();
	   
	   if(str.equalsIgnoreCase("Frappuccino"))
		   order = new Frappuccino();
	   
	   if(str.equalsIgnoreCase("Latte"))
		   order = new Latte();
	   
	   if(str.equalsIgnoreCase("Cappuccino"))
		   order = new Cappuccino();
	   
	   return order;
   }
   
   public void addOption(String option)
   {
	   if(options.contains(option))
	   {
		   System.out.println("option to be added already exists");
	   }
	   else
		   options.add(option);
   }
   
   public void removeOption(String option){
	   options.remove(option);
   }
   
   private int choose(){
	   int index = 0;
	   for(String order:options) {
		   System.out.printf("Enter " + index + " for " + order);
		   System.out.println();
		   index++;
	   }
	   System.out.printf("Enter your choice: ");
	   Scanner input = new Scanner(System.in);
	   int order = input.nextInt();
	   System.out.println();
	   return order;
   }
}
