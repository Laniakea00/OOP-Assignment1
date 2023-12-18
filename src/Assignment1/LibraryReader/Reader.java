package Assignment1.LibraryReader;

public class Reader{
    private String fullName, faculty, birthDate, phone, cardnumber;

    public Reader(String fullName, String faculty, String birthDate, String cardnumber, String phone){
        this.fullName = fullName;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.cardnumber = cardnumber;
        this.phone = phone;
    }

    public void takeBook(String name, int count){
        System.out.println(name + " took " + count + " books." );
    }
    public void takeBook(String name, String... books){
        System.out.print(name + " take books: ");
        for(String book : books) {
            System.out.print(book);
            System.out.print(", ");
        }
    }
    public void takeBook(String name, Book... books) {
        System.out.print(name + " take books: ");
        for (Book book : books) {
            System.out.print(book);
            System.out.print(", ");
        }
    }

    public void returnBook(String name, int count){
        System.out.println(name + " returned " + count + " books." );
    }
    public void returnBook(String name, String... books){
        System.out.print(name + " returned books: ");
        for(String book : books) {
            System.out.print(book);
            System.out.print(", ");
        }
    }
    public void returnBook(String name, Book... books) {
        System.out.print(name + " returned books: ");
        for (Book book : books) {
            System.out.print(book);
            System.out.print(", ");
        }
    }
}

class Book {
    private String name, author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}