package com.example.parkingdatabase;



import java.util.*;
import java.io.*;

public class Properties {
    public static void main(String[] args) throws Exception {
        // get all the system properties
        java.util.Properties p = System.getProperties();

        // stores set of properties information
        Set set = p.entrySet();

        // iterate over the set
        Iterator itr = set.iterator();
        while (itr.hasNext()) {

            // print each property
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = "
                    + entry.getValue());
        }
    }
}

