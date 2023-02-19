package it.euris.academy2023.library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Come uccidono le brave ragazze", "Holly Jackson", 2021, "Thriller"));
        library.addBook(new Book("Brave ragazze, sangue cattivo", "Holly Jackson", 2022, "Thriller"));
        library.addBook(new Book("Homebody", "Rupi Kaur", 2021, "Poetry"));

        library.printAll();
        library.sort();
        library.printAll();

    }
}
