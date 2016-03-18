package com.company;

/**
 * Created by John on 1/30/2016.
 */
public class LuceneConstants {
    public static final String CONTENTS="contents";
    public static final String FILE_NAME="filename";
    public static final String FILE_PATH="filepath";
    public static final String TEMPLATE = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \n" +
            "\"http://www.w3.org/TR/html4/loose.dtd\">\n" +
            "<html>\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
            "<title>$title</title>\n" +
            "<h1>$header</h1>\n" +
            "</head>\n" +
            "<body>$body\n" +
            "</body>\n" +
            "</html>";
    public static final int MAX_SEARCH = 10;
}
