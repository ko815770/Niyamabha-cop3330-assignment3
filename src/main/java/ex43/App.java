package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        website web = new website();
        System.out.println("Site name" );
        web.setName(input.nextLine());
        System.out.println("Author: ");
        web.setAuthor(input.nextLine());
        System.out.println("Do you want a folder for JavaScript? ");
        web.setJava(input.next().charAt(0));
        System.out.println("DO you want a folder for CSS? ");
        web.setCss(input.next().charAt(0));
        web.makeweb(web.getName(), web.getAuthor(), web.getJava(), web.getCss());
    }
}

/*
    main {
        Scanner input
        class constructor
        prompt and input name, author, java, css
        function create web
    }
 */
