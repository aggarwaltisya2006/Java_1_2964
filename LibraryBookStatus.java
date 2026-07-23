package DAY11;

import java.util.Scanner;

class Book {
    String bookId;
    String title;
    String author;
    boolean issued;

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
        System.out.println("Book Status: " + (issued ? "Issued" : "Available"));
    }
}

public class LibraryBookStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();
        System.out.print("Enter Book ID: ");
        book.bookId = sc.nextLine();
        System.out.print("Enter Title: ");
        book.title = sc.nextLine();
        System.out.print("Enter Author: ");
        book.author = sc.nextLine();
        book.issued = false;

        System.out.println();
        book.issueBook();
        book.displayBook();

        book.returnBook();
        book.displayBook();

        sc.close();
    }
}
