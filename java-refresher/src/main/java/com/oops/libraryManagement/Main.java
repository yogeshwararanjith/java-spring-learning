package com.oops.libraryManagement;

public class Main {

    public static void main(String[] args) {
        Book selfHelp = new Book("cal Newport",true,"3123",2021,"Deep work");
        Book book = new Book("cal Newport",true,"3124",2021,"Deep work");
        System.out.println(selfHelp.equals(book));

        Book duplicateBook = new Book(book);

        System.out.println(selfHelp.toString());
        System.out.println(selfHelp.hashCode());
        System.out.println(book.hashCode());

        Student student1 = new Student("S001", "Ranjith", "ranjith@email.com");
        student1.borrowBook(selfHelp);
        System.out.println("Book "+ student1.getBorrowedBooks()+" "+student1.getBorrowedBookCount());
        student1.returnBook(selfHelp);
        System.out.println("Book "+ student1.getBorrowedBooks()+" "+student1.getBorrowedBookCount());
    }

}
