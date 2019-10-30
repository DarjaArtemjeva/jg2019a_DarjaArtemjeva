package lv.jg.lesson6;

public class PrimeNumberLookupTest {
    public static void main(String[] args) {
        PrimeNumberLookupTest testRunner = new PrimeNumberLookupTest();
        testRunner.shouldFindAllPrimeNumbers();
    }

    private void shouldFindAllPrimeNumbers() {
        PrimeNumberLookup primeNumberLookup = new PrimeNumberLookup();
        primeNumberLookup.printWithinInterval(0, 15);
    }
}
