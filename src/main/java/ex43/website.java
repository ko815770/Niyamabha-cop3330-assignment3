package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class website {
    String name, author;
    char java, css;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setJava(char java) {
        this.java = java;
    }

    public void setCss(char css) {
        this.css = css;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public char getJava() {
        return java;
    }

    public char getCss() {
        return css;
    }

    public int makeweb(String name, String author, char java, char Css)
    {
        String path = System.getProperty("user.dir");
        path += "\\" + name;
        File website = new File(path);
        boolean make = website.mkdir();
        if (make)
        {
            System.out.println("Created " + path);
            try
            {
                FileWriter out = new FileWriter(path + "\\index.html");
                out.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                out.write("\t<meta author=\""+author+"\">\n");
                out.write("\t<title>"+ name +"</title>\n");
                out.write("</head>\n<body>\n\n</body>\n</html>");
                out.close();
                System.out.println("Created " + path + "\\index.html");
                if (java == 'Y' || java == 'y')
                {
                    File javaFolder = new File(path + "\\js");
                    boolean javafd = javaFolder.mkdir();
                    if (javafd)
                    {
                        System.out.println(("Created " + javaFolder+"\\"));
                    }
                }
                if (Css == 'Y' || Css == 'y')
                {
                    File cssFolder = new File(path + "\\css");
                    boolean cssfd = cssFolder.mkdir();
                    if (cssfd)
                    {
                        System.out.println(("Created " + cssFolder+"\\"));
                    }
                }
                return 0;
            }
            catch(IOException e)
            {
                return -1;
            }
        }
        return -1;
    }
}
/*
    declare string name, author
    declare char java, css
    get and set each variable
    function make web (name. author, java, css) {
        create path
        create boolean for verification
        if (true)
            print create path
            create web
            close file
            if (java/cs is yes)
                create java/cs
            return 0
        else
        return -1
    }
 */