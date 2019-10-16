package lv.jg.lesson4;

public class Conditionals {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5 && x < 15) {
            System.out.println("X is within bounds");
        }
        if (x < 5 || x >= 10) {
            System.out.println("X is correct");
        }
        if ((x > 5 && x < 10) || (x >= 10 && x <= 20)) {
            System.out.println("X is secondly correct");
        }
        if (x != 20) {
            System.out.println("X is not 20");
        }
        if (isNotInBoundsExcept10(x)) {
            System.out.println("X is 10");
        }
    }

    private static boolean isNotInBoundsExcept10(int x) {
        return (x < 5 && x > 15) || x == 10;
    }
}
