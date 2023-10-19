package com.example.myprojj0;

import java.util.ArrayList;

//here in several steps future-ly backend will be by mysql & python and font end with java &android-firebase for backend (eshi b5wiif XD )
public class DataBase {
    //this is a mook up to not to wait for the backend programming , so to only test out front-end , and after success of both back and front we only integrate our work
private ArrayList<Book>books = new ArrayList<>();
public DataBase(){
    books.add(new Book("SWE","Iyan Sommervile","Software Engineering"));
    books.add(new Book ("Proffesional Android ","John ","Programming"));

}
public ArrayList<Book> getBooks(String cat ){
    ArrayList<Book>result=new ArrayList<>();
    //then enhanced loop to search if our book exists
    for (Book b:books) {
        if(b.getCategory().equalsIgnoreCase(cat)){
            result.add(b);
        }
    }
    return result;

}

}
