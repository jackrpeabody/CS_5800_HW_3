package Decorator;

public class CustomerLoyaltyStatus {
    
    private String loyaltyStatus;

    public CustomerLoyaltyStatus(String loyaltyStatus){
        this.loyaltyStatus = loyaltyStatus;
    }

    public double applyDiscount(double orderCost){
        double discount = 0.0;
        if(loyaltyStatus.equals("Gold")){
            discount = 0.20;
        }
        else if(loyaltyStatus.equals("Silver")){
            discount = 0.15;
        }
        else if(loyaltyStatus.equals("Bronze")){
            discount = 0.10;
        }
        return orderCost - (orderCost * discount);
    }
}
