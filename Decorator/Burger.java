package Decorator;

public class Burger implements Food {

    private final String foodName = "Burger";
    private final double basePrice = 9.99;

    public Burger() {}

    public String getFoodDescription(){
        return foodName;
    }

    public double getCost(){
        return basePrice;
    }
}
