package lv.jg.lesson9.BookStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStoreTest {
    public static void main(String[] args) {
        BookStoreTest tests = new BookStoreTest();
        tests.sortedBookStore(create());
        tests.sortedBooksByAuthor(create());
    }

    private void sortedBooksByAuthor(List<Book> books) {
        books.sort(new BookAuthorComporator());
        books.stream().forEach(System.out::println);
    }

    public void sortedBookStore(List<Book> listOfBook){
        for (Book book : listOfBook){
            System.out.println(book);
        }
        System.out.println("-------------------------------------------------------------");
        Collections.sort(listOfBook);
        listOfBook.stream().forEach(System.out::println);
    }

    public static List<Book> create(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(Genre.HORROR, "The female Persuasion", "Meg Wolitzer"));
        list.add(new Book(Genre.NOVEL, "True roots", "Kristin Cavallari"));
        list.add(new Book(Genre.DETECTIVE, "A Day in the Life of Marlon Bundo", "Kristin Cavallari"));
        list.add(new Book(Genre.DRAMA, "She felt like feeling nothing", "r.h. Sin"));
        list.add(new Book(Genre.HORROR, "The rational bible: Exodus", "Denis Prager"));
        list.add(new Book(Genre.NOVEL, "Ready player one", "Ernest Cline"));
        return list;
    }
}
