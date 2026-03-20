package com.oops.libraryManagement;

import java.util.Objects;
import java.time.Year;


public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book() {
    }

    public Book(String author, boolean isAvailable, String isbn, int publicationYear, String title) {
        this.author = author;
        this.isAvailable = isAvailable;
        this.isbn = formatISBN(isbn);
        this.publicationYear = publicationYear;
        this.title = title;
    }

    // copy constructor
    public Book(Book originalBook){
        this.author = originalBook.author;
        this.isAvailable = originalBook.isAvailable;
        this.isbn = originalBook.isbn;
        this.publicationYear = originalBook.publicationYear;
        this.title = originalBook.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String formatISBN(String isbn){
        return "ISBN-"+isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        int currentYear = Year.now().getValue();
        if(publicationYear > 1000 && publicationYear <= currentYear) {
            this.publicationYear = publicationYear;
        }
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+"{"+
                "title='"+getTitle()+ '\'' +
                ", author='"+getAuthor()+'\''+
                ",isbn='"+getIsbn()+'\''+
                ",isAvailable='"+isAvailable()+'\''+
                "}";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return book.getIsbn().equals(getIsbn());
    }

    @Override
    public int hashCode(){
        return Objects.hash(isbn);
    }
}
