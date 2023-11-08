package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Author {
    private int id;
    private String name;

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Book {
    private int id;
    private String title;
    private int authorId;

    public Book(int id, String title, int authorId) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}

public class LibraryApp {
    private static Map<Integer, Author> authors = new HashMap<>();
    private static Map<Integer, Book> books = new HashMap();
    private static int authorIdCounter = 1;
    private static int bookIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add an author");
            System.out.println("2. View authors");
            System.out.println("3. Add a book");
            System.out.println("4. View books");
            System.out.println("5. Delete an author");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    addAuthor(scanner);
                    break;
                case 2:
                    viewAuthors();
                    break;
                case 3:
                    addBook(scanner);
                    break;
                case 4:
                    viewBooks();
                    break;
                case 5:
                    deleteAuthor(scanner);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option choice.");
            }
        }
    }

    private static void addAuthor(Scanner scanner) {
        System.out.print("Enter author's name: ");
        String name = scanner.nextLine();
        Author author = new Author(authorIdCounter, name);
        authors.put(authorIdCounter, author);
        authorIdCounter++;
        System.out.println("Author added to the database.");
    }

    private static void viewAuthors() {
        System.out.println("List of authors:");
        for (Author author : authors.values()) {
            System.out.println(author);
        }
    }

    private static void addBook(Scanner scanner) {
        if (authors.isEmpty()) {
            System.out.println("Please add an author first.");
            return;
        }

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.println("List of authors:");
        for (Author author : authors.values()) {
            System.out.println(author.getId() + ". " + author.getName());
        }

        System.out.print("Select an author (by ID): ");
        int authorId = scanner.nextInt();

        if (!authors.containsKey(authorId)) {
            System.out.println("Author with that ID does not exist.");
            return;
        }

        Book book = new Book(bookIdCounter, title, authorId);
        books.put(bookIdCounter, book);
        bookIdCounter++;
        System.out.println("Book added to the database.");
    }

    private static void viewBooks() {
        System.out.println("List of books:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    private static void deleteAuthor(Scanner scanner) {
        System.out.println("List of authors:");
        for (Author author : authors.values()) {
            System.out.println(author.getId() + ". " + author.getName());
        }

        System.out.print("Select an author to delete (by ID): ");
        int authorId = scanner.nextInt();

        if (!authors.containsKey(authorId)) {
            System.out.println("Author with that ID does not exist.");
            return;
        }

        // Delete the author and all their books
        for (int bookId : books.keySet()) {
            if (books.get(bookId).getAuthorId() == authorId) {
                books.remove(bookId);
            }
        }

        authors.remove(authorId);

        System.out.println("Author and all their books have been deleted.");
    }
}
