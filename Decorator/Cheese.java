package Decorator;

public class Cheese implements Topping {
    private final String toppingName = "Cheese";
    private final double basePrice = 1.99;

    public Cheese() {}

    public String getToppingName(){
        return toppingName;
    }

    public double getCost(){
        return basePrice;
    }
}