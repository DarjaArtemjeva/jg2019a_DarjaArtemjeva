package lv.jg.lesson6;

public class PrimeNumberLookup {
    public void printWithinInterval(int from, int to) {
        for (int i = from; i <= to; i++) {              // for (; from < to; from++)
            if (isPrimeNumber(i)) {

                System.out.println(i + " Is Prime number");
            } else {
                System.out.println(i + " Doesn't count as Prime number!");
            }
        }
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
