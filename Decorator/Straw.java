package Decorator;

public class Straw implements Topping {
    private final String toppingName = "Straw";
    private final double basePrice = 0.25;

    public Straw() {}

    public String getToppingName(){
        return toppingName;
    }

    public double getCost(){
        return basePrice;
    }
}