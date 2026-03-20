package com.oops.libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Borrowable {

    private String studentId;
    private String name;
    private String email;
    private List<Book> borrowedBooks;

    public Student(String email, String name, String studentId) {
        this.email = email;
        this.name = name;
        this.studentId = studentId;
        this.borrowedBooks = new ArrayList<>();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || email.contains("@") || email.contains(".com")){
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(studentId);
    }

//    public void addBorrowedBook(Book book){
//        if(borrowedBooks.size() > 3){
//            return;
//        }
//         borrowedBooks.add(book);
//    }
//
//    public void removeBorrowedBook(Book book){
//        borrowedBooks.remove(book);
//    }

    public int getBorrowedBookCount(){
        return borrowedBooks.size();
    }

    public void borrowBook(Book book){
        if(borrowedBooks.size() > 3){
            return;
        }
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
}
