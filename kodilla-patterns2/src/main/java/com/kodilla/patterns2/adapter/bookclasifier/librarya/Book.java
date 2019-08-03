package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publicationTear;
    private final String signature;

    public Book(String author, String title, int publicationTear, String signature) {
        this.author = author;
        this.title = title;
        this.publicationTear = publicationTear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationTear() {
        return publicationTear;
    }

    public String getSignature() {
        return signature;
    }
}
