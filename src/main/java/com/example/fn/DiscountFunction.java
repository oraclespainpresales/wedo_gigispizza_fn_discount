package com.example.fn;

public class DiscountFunction {

    public String handleRequest(String input) {
        String name = (input == null || input.isEmpty()) ? "world"  : input;
        //min 10$ to initialize discounts
        String totalPayedParam = (input == null || input.isEmpty()) ? "10"  : input;

        int discountApplied = 0;
        
        //cast string input into a float
        System.out.println("inside Discount Function helloword fn function!!! ");
	    int totalPayedValue = Integer.parseInt(totalPayedParam);			

        System.out.println("totalPayedValue before discount :" + totalPayedValue);

        if  ((totalPayedValue > 10) && (totalPayedValue <= 20)){
            discountApplied = 2;
        };

        if  ((totalPayedValue > 20) && (totalPayedValue <= 30)){
            discountApplied = 5;
        };

        if  ((totalPayedValue > 30)){
            discountApplied = 9;
        };
        //apply calculation to float eg: discount = 10%
        System.out.println("discountApplied :" + discountApplied + "$");

	    totalPayedValue = (totalPayedValue - discountApplied);	
        System.out.println("totalPayedValue after discount :" + totalPayedValue + "$");		

        String totalPayedValueToReturn = Integer.toString(totalPayedValue);

        //return string
        System.out.println("leaving Java helloword fn function!!! ");
        return totalPayedValueToReturn;
    }


}