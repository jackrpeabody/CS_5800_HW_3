package Decorator;

public class Lettuce implements Topping {
    private final String toppingName = "Lettuce";
    private final double basePrice = 0.49;

    public Lettuce() {}

    public String getToppingName(){
        return toppingName;
    }

    public double getCost(){
        return basePrice;
    }
}