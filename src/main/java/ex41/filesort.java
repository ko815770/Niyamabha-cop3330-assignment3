package ex41;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class filesort {
    ArrayList<String> object = new ArrayList<>();
    // Add individual name to an object
    public void addlist(String read) {
        this.object.add(read);
    }
    // get the object
    public ArrayList<String> getObject() {
        return object;
    }
    // sort and print the object in order
    public int printlist(ArrayList<String> object)
    {

        try {
            FileWriter out = new FileWriter("exercise41_output.txt");
            out.write("Total of " + object.size() + " names\n");
            out.write("-----------------\n");
            Collections.sort(object);
            for (int i = 0; i < object.size(); i++) {
                out.write(object.get(i) + "\n");
            }
            out.close();
            return 0;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return -1;
        }
    }
}
/*
    declare arraylist
    function add list
    function get list
    function print list (list) {
        create output file
        write file header
        for loop
            {
                write list
            }
        return -1 or 0 if it work
    }
 */
