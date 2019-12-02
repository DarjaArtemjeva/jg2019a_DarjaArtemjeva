package lv.jg.homeWork.Book;

public class Book {
    private String author;
    private String title;
    private int pageCount;

    Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return this.author.equals(book.author); //&& this.amount == candyBox.amount;
    }

    @Override
    public String toString(){
        return "Book: { " + "Author: " + author + "Title: " + title + "Page Count: " + pageCount + "}";
    }


}
