package com.thinkful.app; 

public class DeclareTemp {

    public static void main(String[] args) {

        Integer temperature = 79; 
        String highestTemp = "Highest temp in June in New York is %d F˚ \n";
        System.out.printf(highestTemp, temperature);

        String name = "The name of this course is \"Java/Spring programming\"";
        System.out.println(name);

        String number = "The phone number of the bus service is 555-5555";
        System.out.println(number);

        Double price = 39.98; 
        String shoeCost = "The price of the show is $%f \n";
        System.out.printf(shoeCost, price);

        String mass = "1.89813 x 10²⁷";
        String stringMass = "The mass of the planet Jupiter is %s kilograms \n";
        System.out.printf(stringMass, mass);
    }
}