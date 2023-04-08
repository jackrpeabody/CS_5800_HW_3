package Decorator;

import java.util.ArrayList;

public class CustomerOrder {
    
    private ArrayList<Food> order = new ArrayList<Food>();

    public CustomerOrder(ArrayList<Food> order){
        this.order = order;
    }

    public String getOrderDescription(){
        String description = "Order: {";
        for(int i = 0; i < order.size() - 1; i++){
            Food item = order.get(i);
            description += item.getFoodDescription() + ", ";
        }
        description += order.get(order.size() - 1).getFoodDescription() + "}";
        return description;
    }

    public double getOrderCost(){
        double orderCost = 0.0;
        for(Food item: order){
            orderCost += item.getCost();
        }
        return orderCost;
    }
}
