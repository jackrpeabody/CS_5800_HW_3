package Decorator;

public class Onion implements Topping {
    private final String toppingName = "Onion";
    private final double basePrice = 0.99;

    public Onion() {}

    public String getToppingName(){
        return toppingName;
    }

    public double getCost(){
        return basePrice;
    }
}