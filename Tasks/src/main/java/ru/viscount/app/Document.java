package ru.viscount.app;

public class Document {
    String text;
    String author;

    public Document(String t, String a){
        text = t;
        author = a;
    }
    public String getContext(){
        return "Text: " + text + "\nAuthor: " + author;
    }
}
