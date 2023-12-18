package Assignment1.LibraryReader;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Alan", "SE", "Science", "28-05-2006", "8707-777-77-77");
        readers[1] = new Reader("Olzhas", "SE", "Arts", "18-05-2006", "8700-100-01-01");
        readers[2] = new Reader("Mikhail", "SE", "Engineering", "01-05-2004", "8777-123-45-67");

        readers[0].takeBook("Alibek" , 3);
        readers[1].takeBook("Adventures", "Dictionary", "Encyclopedia");
        readers[2].takeBook(
                "Nurdaulet", new Book("Mathematics", "Ansar A."),
                new Book("Literature", "Kadyr D."),
                new Book("History", "Alimzhan G.")
        );

        readers[0].returnBook("Adventures", "Dictionary", "Encyclopedia");
        readers[1].returnBook("Alibek",2);
        readers[2].returnBook(
                "Nurdaulet",new Book("Mathematics", "Ansar A."),
                new Book("Literature", "kadyr D.")
        );
    }
}

