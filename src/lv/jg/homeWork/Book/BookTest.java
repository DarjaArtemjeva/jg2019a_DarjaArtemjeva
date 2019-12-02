package lv.jg.homeWork.Book;

public class BookTest {
    public static void main(String[] args) {
        Book firstBook = new Book("Steven King ", "IT ", 333);
        Book secondBook = new Book("Steven King ", "Dark tower ", 296);
        boolean expectedResult = true;

        System.out.println("Book equals true Test");
        boolean actualResult = firstBook.equals(secondBook);
        if (actualResult) {
            System.out.println("Passed");

        } else {
            System.out.println("FAILED!");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual: " + actualResult);
        }
        System.out.println(firstBook);
        System.out.println(secondBook);

    }
}
