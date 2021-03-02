package com.company;

import java.util.Random;

public class Reader {
    //Метод выбора книги
    public Book choiceBook(Book books[]) {
        Random random = new Random();
        return books[random.nextInt(books.length)];
    }
    //Метод чтения выбранной книги
    public void readBook(Book book) {
        System.out.println(book);
    }
    //Метод подсчета рейтинга книги
    public void calculateRating(Book book) {
        Random random = new Random();
        int countNamebook;
        if (book.namebook != null) {
            String nameBook = book.namebook.replace(" ", "");
            countNamebook = nameBook.length();
            //Если пустое после удаление пробелов
            if (countNamebook == 0) {
                countNamebook = -random.nextInt(25);
            }
        } else {
            countNamebook = -random.nextInt(25);
        }

        int countAuthor;
        if (book.author != null) {
            String author = book.author.replace(" ", "");
            countAuthor = author.length();
            //Если пустое после удаление пробелов
            if (countAuthor == 0) {
                countAuthor = -random.nextInt(25);
            }
        } else {
            countAuthor = -random.nextInt(25);
        }

        //Считаю, если ввели в конструкоре "0", то выполняется условие незаполненного поля.
        int countSerialNumber;
        if (book.serialNumber == 0) {
            countSerialNumber = random.nextInt(25);
        } else countSerialNumber = book.serialNumber;

        //Считаю, если ввели в конструкоре "0", то выполняется условие незаполненного поля.
        int countPage;
        if (book.pageCount == 0) {
            countPage = -random.nextInt(25);
        } else countPage = book.pageCount;

        int rating = countNamebook + countAuthor - countSerialNumber + countPage;
        System.out.println("Рейтинг книги: " + rating);
    }
}
