package com.example.parkingdatabase;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListCarsUsingParking {

    private final ParkingService parkingService;

    public ListCarsUsingParking(ParkingService parkingService) {
        this.parkingService = parkingService;
    }
   public LinkedList<ParkingService> parkingServices = new LinkedList<ParkingService>();
    /*
   for (ParkingService e: parkingServices){
        System.out.println(e.toString());
   }
  */
    ListIterator iter = parkingServices.listIterator(parkingServices.size());
   {
       while(iter.hasPrevious())
           System.out.println(iter.previous());
}
    }







