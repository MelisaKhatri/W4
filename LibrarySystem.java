public class LibrarySystem {
    public static void main(String[] args) {

        LibraryItem[] catalog = {
            new Book("Atomic Habits", "James Clear", 101, "Self-Help", "5th Edition"),
            new Magazine("Tech Today", "Sarah Wilson", 102, "Technology", "Monthly"),
            new Newspaper("The Daily Herald", "Michael Brown", 103, "Current Affairs", "Daily")
        };

        for (LibraryItem item : catalog) {
            item.getInfo();
        }
    }
}

abstract class LibraryItem {
    public String title;
    public String author;
    public int id;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem {
    public String genre;
    public String edition;

    public Book(String title, String author, int id, String genre, String edition) {
        super(title, author, id);
        this.genre = genre;
        this.edition = edition;
    }

    @Override
    public void getInfo() {
        System.out.println("Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Genre: " + genre);
        System.out.println("Edition: " + edition + "\n");
    }
}

class Magazine extends LibraryItem {
    public String category;
    public String publicationFrequency;

    public Magazine(String title, String author, int id, String category, String publicationFrequency) {
        super(title, author, id);
        this.category = category;
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public void getInfo() {
        System.out.println("Magazine");
        System.out.println("Title: " + title);
        System.out.println("Editor: " + author);
        System.out.println("ID: " + id);
        System.out.println("Category: " + category);
        System.out.println("Publication Frequency: " + publicationFrequency + "\n");
    }
}

class Newspaper extends LibraryItem {
    public String section;
    public String publicationFrequency;

    public Newspaper(String title, String author, int id, String section, String publicationFrequency) {
        super(title, author, id);
        this.section = section;
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public void getInfo() {
        System.out.println("Newspaper");
        System.out.println("Title: " + title);
        System.out.println("Editor: " + author);
        System.out.println("ID: " + id);
        System.out.println("Section: " + section);
        System.out.println("Publication Frequency: " + publicationFrequency + "\n");
    }
}