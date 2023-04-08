package Decorator;

public abstract class FoodItemDecorator implements Food {
    
    protected Food foodItem;

    public FoodItemDecorator(Food foodItem){
        this.foodItem = foodItem;
    }

    public String getFoodDescription(){
        return this.foodItem.getFoodDescription();
    }

    public double getCost(){
        return this.foodItem.getCost();
    }
}
