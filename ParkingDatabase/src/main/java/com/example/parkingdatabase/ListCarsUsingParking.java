package com.example.parkingdatabase;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListCarsUsingParking {


    private ParkingService run;

    public ListCarsUsingParking(ParkingService run) {
        this.run = run;
    }


    LinkedList<ParkingService> carlist = new LinkedList<ParkingService>();


    ListIterator iter = carlist.listIterator(carlist.size());
    {
       while(iter.hasPrevious())
        System.out.println(iter.previous());

    }



    }







