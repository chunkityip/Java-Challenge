package Conditional;

public class ConditionalAnswer {

    /**
     * Create a method calculateDiscount that accepts a Customer
     * object containing information like membership type
     * (Standard, Premium, VIP), and total purchase amount.
     * Implement conditional logic to calculate the final price:
     *
     * Standard members receive no discount.
     * Premium members receive a 10% discount if their purchase is above $500.
     * VIP members always receive a 15% discount, and an additional 5% if their purchase is above $1000.
     */

    public double calculateDiscount(boolean Standard , boolean Prenium , boolean VIP , double amount) {
        double total;
        if (VIP && amount > 100) {
            total = amount - (amount * 20%);
        } else if (Prenium)



    }
}
