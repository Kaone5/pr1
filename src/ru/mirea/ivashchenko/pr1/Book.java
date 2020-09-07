package ru.mirea.pr1;

public class Book {
    private int pages;
    private String genre = " ";

    public Book(int p, String g){
        pages = p;
        genre = g;
    }

    public Book(int p){
        pages = p;
    }

    public Book(String g){
        genre = g;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getPages(){
        return pages;
    }

    public String getGenre(){
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}