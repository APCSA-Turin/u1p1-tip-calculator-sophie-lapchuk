package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        double percentageDecimal = ((double)percent / 100); // calculating the decimal value of the percent
        double tip = cost * percentageDecimal; // calculating the tip for the cost
        double costWithTip = cost + tip; // adding the two to get the total cost

        double costPerPerson = cost / people; // calculate the cost per person WITHOUT tip
        double tipPerPerson = tip / people; // calculate the tip per person
        double totalPerPerson = costWithTip / people; // calculate the total with the tip per person


        // i learned how to format the decimal from a classmate, Tyler Walters
        result.append("-------------------------------\n");
        result.append("Total bill before tip: ").append("$"+String.format("%.2f", cost)).append("\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: ").append(percent + "%").append("\n");
        result.append("Total tip: ").append("$" + String.format("%.2f", tip)).append("\n");
        result.append("Total Bill with tip: ").append("$" + String.format("%.2f", costWithTip)).append("\n");
        result.append("Per person cost before tip: ").append("$" + String.format("%.2f", costPerPerson)).append("\n");
        result.append("Tip per person: ").append("$" + String.format("%.2f", tipPerPerson)).append("\n");
        result.append("Total cost per person: ").append("$" + String.format("%.2f", totalPerPerson)).append("\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
       int percent = 15;
        double cost = 566.97;              
       System.out.println(calculateTip(people,percent,cost));
    }
}
        
