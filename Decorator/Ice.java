package Decorator;

public class Ice implements Topping {
    private final String toppingName = "Ice";
    private final double basePrice = 0.10;

    public Ice() {}

    public String getToppingName(){
        return toppingName;
    }

    public double getCost(){
        return basePrice;
    }
}