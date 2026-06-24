import java.io.*;
import java.util.*;

public class Library {

    static final String FILE_PATH = "books.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = loadBooks();
        int action;

        do {
            System.out.print("______________________________________________________\n" +
                    "1 - Show available books\n2 - Add a book\n3 - Library storage\n4 - Exit\nEnter Action: ");
            action = sc.nextInt();
            sc.nextLine();
            System.out.println("______________________________________________________");

            if (action == 1) {
                if (books.isEmpty()) {
                    System.out.println("No books in the library.");
                } else {
                    System.out.println("Books currently in the library:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }
                }

            } else if (action == 2) {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                books.add(title);
                saveBooks(books);
                System.out.println("Book added and saved.");

            } else if (action == 3) {
                System.out.println("Total books in library: " + books.size());

            } else if (action == 4) {
                System.out.println("Exiting..");
            }

        } while (action != 4);

        sc.close();
    }

    static ArrayList<String> loadBooks() {
        ArrayList<String> books = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) return books;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    books.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }

        return books;
    }

    static void saveBooks(ArrayList<String> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String book : books) {
                writer.write(book);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }
}