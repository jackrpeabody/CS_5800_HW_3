package Decorator;

public class Sauce implements Topping {
    private final String toppingName = "Sauce";
    private final double basePrice = 0.49;

    public Sauce() {}

    public String getToppingName(){
        return toppingName;
    }

    public double getCost(){
        return basePrice;
    }
}