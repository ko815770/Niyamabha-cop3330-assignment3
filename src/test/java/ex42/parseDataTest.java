package ex42;

import ex41.filesort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class parseDataTest {

    @Test
    void printlist() {
        parseData test = new parseData();
        test.addlist("test1,test2,test3");
        assertEquals(0, test.printlist(test.getObject()));
    }
}