package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        

        double percentageDecimal = percent / 100;
        double tip = cost * percentageDecimal;
        double costWithTip = cost + tip;

        double costPerPerson = cost / people;
        
        double tipPerPerson = tip / people;
        double totalPerPerson = costWithTip / people;



        result.append("-------------------------------\n");
        result.append("Total bill before tip: ").append(String.format("%.2f", cost)).append("\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: ");
        result.append("Total tip: ");
        result.append("Total Bill with tip: ");
        result.append("Per person cost before tip: ");
        result.append("Tip per person: ");
        result.append("Total cost per person: ");
        result.append("-------------------------------\n");

       

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 8; 
        int percent = 22;
        double cost = 98.45938726209473649372;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
