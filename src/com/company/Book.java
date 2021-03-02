package com.company;

public class Book {
    String author;
    String namebook;
    int serialNumber;
    int pageCount;

    public Book(String author, String namebook, int serialNumber, int pageCount) {
        this.author = author;
        this.namebook = namebook;
        this.serialNumber = serialNumber;
        this.pageCount = pageCount;
    }

    public Book(String author, String namebook, int pageCount) {
        this.author = author;
        this.namebook = namebook;
        this.pageCount = pageCount;
    }

    public Book(String author, int serialNumber, String namebook) {
        this.author = author;
        this.namebook = namebook;
        this.serialNumber = serialNumber;
    }

    public Book(String author, String namebook) {
        this.author = author;
        this.namebook = namebook;
    }

    public Book(String namebook, int pageCount) {
        this.namebook = namebook;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        String result = "";
        // С помощью trim избавляемся от строк состоящих из пробелов
        if (author == null || author.trim().length() == 0) {
            result += "Автор: Неизвестный";
        } else {
            result += "Автор: " + author;
        }

        if (namebook == null || namebook.trim().length() == 0) {
            result += ", Название книги: Неизвестно";
        } else {
            result += ", Название книги: \"" + namebook + "\"";
        }

        if (serialNumber == 0) {
            result += ", Серия: Неизвестна";
        } else {
            result += ", Серия: " + serialNumber;
        }

        if (pageCount == 0) {
            result += ", Страниц: Неизвестно";
        } else {
            result += ", Страниц: " + pageCount;
        }

        return result;
    }
}
