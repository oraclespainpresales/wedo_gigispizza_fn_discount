package com.example.fn;

public class DiscountFunction {

    public String handleRequest(String input) {
        //min 10$ to initialize discounts
        String totalPaidParam = (input == null || input.isEmpty()) ? "10"  : input;

        double discountApplied = 0;

        //cast string input into a float
        System.out.println("inside Discount Function gigis fn function!!! ");
        double totalPaidValue = Double.parseDouble(totalPaidParam);

        System.out.println("totalPaidValue before discount :" + totalPaidValue);

        if  ((totalPaidValue > 10) && (totalPaidValue <= 15)){
            discountApplied = 0.02;
        } else if  ((totalPaidValue > 15) && (totalPaidValue <= 20)){
            discountApplied = 0.05;
        } else if  ((totalPaidValue > 20)){
            discountApplied = 0.07;
        };

        //apply calculation to float eg: discount = 10%
        System.out.println("discountApplied : " + (discountApplied*100) + "%");

        totalPaidValue -= (totalPaidValue*discountApplied);
        System.out.println("totalValue after discount :" + totalPaidValue + "$");

        String totalPaidValueToReturn = Double.toString(totalPaidValue);

        //return string
        System.out.println("leaving Java Discount Function gigis fn function!!! ");
        return totalPaidValueToReturn;
    }
}