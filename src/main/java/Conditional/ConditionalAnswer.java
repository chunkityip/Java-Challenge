package Conditional;

public class ConditionalAnswer {

    /**
     * Create a method calculateDiscount that accepts a Customer
     * object containing information like membership type
     * (Standard, Premium, VIP), and total purchase amount.
     * Implement conditional logic to calculate the final price:
     * <p>
     * Standard members receive no discount.
     * Premium members receive a 10% discount if their purchase is above $500.
     * VIP members always receive a 15% discount, and an additional 5% if their purchase is above $1000.
     */

    public enum Membership {
        Standard,
        Premium,
        VIP
    }

    public double calculateDiscount(Membership membership, double amount) {
        double total = amount;
        switch (membership) {
            case VIP:
                total -= (amount > 1000) ? amount * 0.2 : amount * 0.15; // 20% for VIP over $1000, else 15%
                break;

            case Premium:
                if (amount > 1000) {
                    total -= amount * 0.10;
                }
                break;
            case Standard:
                break;
        }

        return total;
    }

    /**
     * Question 2: Employee Bonus Calculation
     * Write a method getBonusAmount(Employee employee) that calculates
     * the yearly bonus for employees based on their role and years of experience.
     *
     * Junior employees get no bonus.
     * Mid-level employees with less than 5 years of experience get a 5% bonus. If they have 5 or more years of experience, they get a 7% bonus.
     * Senior employees get a 10% bonus, with an additional 2% if they have been with the company for more than 10 years.
     */

    public enum Employee {
        Junior,
        Mid,
        Senior
    }

    public double EmployeeBonusCalculation(Employee employee , double salary , int yearIn) {
        double bouns = 0.0;
        switch (employee) {
            case Senior:
                bouns = (yearIn > 10) ? salary * 0.12 : salary * 0.10;
                break;
            case Mid:
                bouns = (yearIn >= 5 ) ? salary * 0.07 : salary * 0.05;
                break;
            case Junior:
                bouns = 0.0;
                break;
        }
        return bouns;
    }
}