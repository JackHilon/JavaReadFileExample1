// **** This program is intended to demonstrate reading from a file ***********
package javareadfileexample1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JavaReadFileExample1 {

    public static void main(String[] args) {

        File inputFile = new File("countries.txt");
        ArrayList<String> countries = new ArrayList<>();
        String country, response = "y";
        Random rand = new Random();
        try {
            Scanner input = new Scanner(inputFile);
            while (input.hasNextLine()) {
                country = input.nextLine();
                countries.add(country);
            }
        } catch (Exception e) {
            System.out.println("The input file \"countries.txt\" was not found");
            System.out.println(e.toString());
        }
        // ======================================================================
        Scanner input = new Scanner(System.in);
        while (response.equalsIgnoreCase("y")) {
            if (countries.size() <= 0) {
                System.out.println("There are no entries in the file or the file is not existed");
                break;
            }
            System.out.println("The input file \"countries.txt\" is ready for you \n" +
                    "Please think about your entry and hit enter for you reply.");
            input.nextLine();
            System.out.println("The file says: \"" + countries.get(rand.nextInt(countries.size())) + "\"\n");
            System.out.println("Do you have anther question? (y/n)");
            response = input.nextLine();
        }
    }

}// end class
