package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class websiteTest {

    @Test
    void makeweb() {
        website test = new website();
        test.setAuthor("hello");
        test.setName("test");
        test.setJava('y');
        test.setCss('y');
        assertEquals(0, test.makeweb(test.getName(), test.getAuthor(), test.getJava(), test.getCss()));
    }
}