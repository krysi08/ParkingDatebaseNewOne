package com.example.parkingdatabase;

public class PriceList {

    public static void main(String[] args) {

        PriceList list = new PriceList();

       // list.settleCostsParking(96);
    }

    public void settleCostsParking(double timeParking) {
        if (timeParking >= 10.00 && timeParking <= 60.00) {
            System.out.println("Please pay off 5EUR");
        } else if (timeParking > 60.00 && timeParking <= 240.00) {
            double valueCosts = timeParking * 5 / 60.00;
            System.out.println("You have to pay off" + " " + valueCosts + " " + "EUR");
        } else if (timeParking > 240.00) {
            double discountCosts = (timeParking * 4) / 60;
            System.out.println("You have to pay off" + " " + discountCosts + " " + "EUR");
        } else {
            System.out.println("No fees");
        }
    }
    double howlong;
}

