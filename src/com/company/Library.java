package com.company;

public class Library {
    public static void main(String[] args) {
        //Создаем массив книг
        Book book1 = new Book("Акунин", "Левиафан", 3, 237);
        Book book2 = new Book("Любовница смерти", 315);
        Book book3 = new Book("   ", "Женщины Цезаря");
        Book book4 = new Book("Головачев", "  ", 1569);
        Book book5 = new Book("Харпер Ли", 1, "Убить пересмешника");

        Book[] catalog = {book1, book2, book3, book4, book5};

        Reader person = new Reader();
        Book choiceBook = person.choiceBook(catalog);
        person.readBook(choiceBook);
        person.calculateRating(choiceBook);

    }
}
