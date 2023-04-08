package Decorator;

public class Fries implements Food {

    private final String foodName = "Fries";
    private final double basePrice = 4.99;

    public Fries() {}

    public String getFoodDescription(){
        return foodName;
    }

    public double getCost(){
        return basePrice;
    }
}