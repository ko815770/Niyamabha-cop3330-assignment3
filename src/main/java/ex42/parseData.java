package ex42;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class parseData {
    ArrayList<String> object = new ArrayList<>();
    // Add individual name to an object
    public void addlist(String read) {
        this.object.add(read);
    }
    // get the object
    public ArrayList<String> getObject() {
        return object;
    }

    // Break the input list into record list
    public List<String> list(ArrayList<String> object, int index)
    {
        List<String> templist = Arrays.asList(object.get(index).split(","));
        return templist;
    }
    // separate and print the object in order
    public int printlist(ArrayList<String> object)
    {

        try {
            FileWriter out = new FileWriter("exercise42_output.txt");
            List<String> record;
            out.write("Last      First     Salary\n");
            out.write("--------------------------\n");
            for (int i = 0; i < object.size(); i++) {
                record = list(object, i);
                for (int j = 0; j < 3; j++) {
                    out.write(String.format("%-10s", record.get(j)));
                }
                out.write("\n");
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
    function split list, return new split list
    function print list (list) {
        create output file
        write file header
        for loop
            {
            split list and store in variable
                for loop
                {
                    write variable
                }
            }
        return -1 or 0 if it work
    }
 */