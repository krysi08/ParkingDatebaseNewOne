package com.example.parkingdatabase;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListCarsUsingParking {


    private Run run;

    public ListCarsUsingParking(Run run) {
        this.run = run;
    }


    LinkedList<Run> carlist = new LinkedList<Run>();


    ListIterator iter = carlist.listIterator(carlist.size());
    {
       while(iter.hasPrevious())
        System.out.println(iter.previous());

    }



    }







