package com.example.parkingdatabase;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SignInFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter signin = new PrintWriter("Licenseplates.txt");
        signin.println("TRE543675");
        signin.close();
            }
}
