package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return id + " - " + title + " by " + author;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Book Management ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book Added!");
                    break;

                case 2:
                    System.out.println("\n--- Book List ---");
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();

                    boolean found = false;
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(searchTitle)) {
                            System.out.println("Found: " + b);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = books.removeIf(b -> b.id == removeId);

                    if (removed) {
                        System.out.println("Book Removed!");
                    } else {
                        System.out.println("Book ID not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

