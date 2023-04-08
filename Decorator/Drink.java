package Decorator;

public class Drink implements Food {

    private final String foodName = "Drink";
    private final double basePrice = 2.99;

    public Drink() {}

    public String getFoodDescription(){
        return foodName;
    }

    public double getCost(){
        return basePrice;
    }
}