package de.blogspot.mszalbach.cloudbook.bookstore.domain;




public class Book {

    public Book() {
    }



    public Book( String title, String author ) {
        this.title = title;
        this.author = author;
    }




    private long id;


    private String title;


    private String author;



    public String getTitle() {
        return title;
    }



    public void setTitle( String title ) {
        this.title = title;
    }



    public String getAuthor() {
        return author;
    }



    public void setAuthor( String author ) {
        this.author = author;
    }



    @Override
    public String toString() {
        return "Book{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               '}';
    }
}
