package com.example.parkingdatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataUpload {
    public static void main(String[] args)  throws FileNotFoundException {

        File file = new File("Licenseplates.txt");
        Scanner in = new Scanner(file);

        String plates = in.nextLine();
        System.out.println(plates);
    }
}
