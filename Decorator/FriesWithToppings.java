package Decorator;

import java.util.ArrayList;

public class FriesWithToppings extends FoodItemDecorator {

    private ArrayList<Topping> toppings = new ArrayList<Topping>(); 
    
    public FriesWithToppings(Food foodItem, ArrayList<Topping> toppings){
        super(foodItem);
        this.toppings = toppings;
    }

    public String getFoodDescription(){
        String description = super.getFoodDescription() + " with: [";
        for(int i = 0; i < toppings.size() - 1; i++){
            Topping topping = toppings.get(i);
            description += topping.getToppingName() + ", ";
        }
        description += toppings.get(toppings.size() - 1).getToppingName() + "]";
        return description;
    }

    public double getCost(){
        double cost = super.getCost();
        for(int i = 0; i < toppings.size(); i++){
            Topping topping = toppings.get(i);
            cost += topping.getCost();
        }
        return cost;
    }
}