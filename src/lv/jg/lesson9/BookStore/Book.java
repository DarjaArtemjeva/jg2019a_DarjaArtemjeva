package lv.jg.lesson9.BookStore;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private Genre genre;

    public Book(Genre genre, String author, String title) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }

    @Override
    public int compareTo(Book that) {
        return this.title.compareTo(that.title);
    }

    public String getAuthor() {
        return author;
    }
}
