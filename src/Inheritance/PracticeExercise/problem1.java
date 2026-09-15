package Inheritance.PracticeExercise;

//you have to implement a library using java class library.
//methods: issueBook, returnBook, showAvailableBooks, addBook, etc
//properties: Array to store the available books
//array to store the issued books

import java.sql.SQLOutput;

class Library{
    String [] books;
    int noOfBooks;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void addBook(String book){
        this.books[noOfBooks] = book; //usi index pe lagayega
        noOfBooks++;
        System.out.println(book+ " has been added!");
    }
    void showBook(){
        System.out.println("Available Books are: ");
        for(String book: this.books){
            if(book == null){
                //break; //taaki yeh array ko poora traverse mat krre, kyoki array is of 100 size
                continue;
            }
            System.out.println("* " +book);
        }
    }
    void issueBook(String book){
            for(int i = 0; i < this.books.length; i++)
            {
                if(this.books[i].equals(book)){
                    System.out.println("This boook has been already issued!");
                    this.books[i] = null;
                    return;
            }
//                System.out.println("** " + book);
        }
        System.out.println("This Book Doesnot Exists!");
    }
    void returnBook(String book){
//        this.books[noOfBooks] = book;
        addBook(book);
    }

}
public class problem1 {
    static void main() {
        Library l = new Library();
        l.addBook(" \"Think and Grow Rich\" ");
        l.addBook(" \"DBMS by Navathe and Korth\" ");
        l.addBook(" \"Java by Herbert Schildt\" ");
        l.addBook(" \"Let us C by Yeshwanth Kantekar\" ");
        l.addBook(" \"Harry Potter and the Goblet of Fire\" ");
        l.addBook(" \"The Alchemist by Paulo Cohelo\" ");

        l.showBook();

        l.issueBook(" \"DBMS by Navathe and Korth\" ");
        l.showBook();

        l.returnBook(" \"DBMS by Navathe and Korth\" ");
        l.showBook();
    }
}

/*
 "Think and Grow Rich"  has been added!
 "DBMS by Navathe and Korth"  has been added!
 "Java by Herbert Schildt"  has been added!
 "Let us C by Yeshwanth Kantekar"  has been added!
 "Harry Potter and the Goblet of Fire"  has been added!
 "The Alchemist by Paulo Cohelo"  has been added!
Available Books are:
*  "Think and Grow Rich"
*  "DBMS by Navathe and Korth"
*  "Java by Herbert Schildt"
*  "Let us C by Yeshwanth Kantekar"
*  "Harry Potter and the Goblet of Fire"
*  "The Alchemist by Paulo Cohelo"
This boook has been already issued!
Available Books are:
*  "Think and Grow Rich"
*  "Java by Herbert Schildt"
*  "Let us C by Yeshwanth Kantekar"
*  "Harry Potter and the Goblet of Fire"
*  "The Alchemist by Paulo Cohelo"
 "DBMS by Navathe and Korth"  has been added!
Available Books are:
*  "Think and Grow Rich"
*  "Java by Herbert Schildt"
*  "Let us C by Yeshwanth Kantekar"
*  "Harry Potter and the Goblet of Fire"
*  "The Alchemist by Paulo Cohelo"
*  "DBMS by Navathe and Korth"
 */
