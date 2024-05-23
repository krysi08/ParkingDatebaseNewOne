package com.example.parkingdatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DataUpload {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Licenseplates.txt");
        Scanner in = new Scanner(file);

        LinkedList<String> dataUploads = new LinkedList<>();
        String plates = in.nextLine();

        dataUploads.add(plates);
        ListIterator iterator = dataUploads.listIterator(dataUploads.size());
        {
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }
    }
}