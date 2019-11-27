package lv.jg.lesson9.BookStore;

import java.util.Comparator;

public class BookAuthorComporator implements Comparator<Book> {

    @Override
    public int compare(Book thisBook, Book thatBook) {
        return thisBook.getAuthor().compareTo(thatBook.getAuthor());
    }
}
