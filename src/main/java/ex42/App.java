package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args)
    {
        try {
            File obj = new File("src/main/java/ex42/exercise42_input.txt");
            Scanner input = new Scanner(obj);
            parseData text = new parseData();
            // loop through the text file
            while (input.hasNextLine())
            {
                // add each line to an object
                text.addlist(input.nextLine());
            }
            // sort and print the object
            text.printlist(text.getObject());
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
