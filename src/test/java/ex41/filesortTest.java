package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class filesortTest {

    @Test
    void getObject() {
        filesort test = new filesort();
        test.addlist("test1");
        assertEquals(0, test.printlist(test.getObject()));
    }
}