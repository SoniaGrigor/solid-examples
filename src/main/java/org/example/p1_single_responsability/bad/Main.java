package org.example.p1_single_responsability.bad;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book Name", "Author Name", "text text text");
        Device device = new WindowsConsole();
        book.show(device);
    }
}
