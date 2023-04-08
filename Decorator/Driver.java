package Decorator;

import java.util.Arrays;
import java.util.ArrayList;

public class Driver {
    
    public static void main(String[] args){

        // Create food items
        Food burger = new Burger();
        Food fries = new Fries();
        Food drink = new Drink();

        // Add toppings
        ArrayList<Topping> burgerToppings = new ArrayList<Topping>(Arrays.asList(new Cheese(), new Onion(), new Lettuce(), new Sauce()));
        Food burgerWithToppings = new BurgerWithToppings(burger, burgerToppings);

        ArrayList<Topping> friesToppings = new ArrayList<Topping>(Arrays.asList(new Cheese(), new Onion(), new Sauce()));
        Food friesWithToppings = new FriesWithToppings(fries, friesToppings);

        ArrayList<Topping> drinkToppings = new ArrayList<Topping>(Arrays.asList(new Ice(), new Straw()));
        Food drinkWithToppings = new DrinkWithToppings(drink, drinkToppings);

        // Create an order
        ArrayList<Food> basicOrderItems = new ArrayList<Food>(Arrays.asList(burger, fries, drink));
        CustomerOrder basicOrder = new CustomerOrder(basicOrderItems);
        System.out.println("\nBasic order:\n");
        System.out.println("    " + basicOrder.getOrderDescription());
        System.out.println(String.format("    Cost: $%.2f", basicOrder.getOrderCost()));

        ArrayList<Food> toppingsOrderItems = new ArrayList<Food>(Arrays.asList(burgerWithToppings, friesWithToppings, drinkWithToppings));
        CustomerOrder toppingsOrder = new CustomerOrder(toppingsOrderItems);
        System.out.println("\nToppings order:\n");
        System.out.println("    " + toppingsOrder.getOrderDescription());
        System.out.println(String.format("    Cost: $%.2f", toppingsOrder.getOrderCost()));

        // Apply loyalty discount
        System.out.println("\nApplying 10% discount to basic order:\n");
        CustomerLoyaltyStatus bronzeLoyaltyStatus = new CustomerLoyaltyStatus("Bronze");
        System.out.println(String.format("    Cost: $%.2f", bronzeLoyaltyStatus.applyDiscount(basicOrder.getOrderCost())));

        System.out.println("\nApplying 20% discount to toppings order:\n");
        CustomerLoyaltyStatus goldLoyaltyStatus = new CustomerLoyaltyStatus("Gold");
        System.out.println(String.format("    Cost: $%.2f", goldLoyaltyStatus.applyDiscount(toppingsOrder.getOrderCost())));

    }
}
