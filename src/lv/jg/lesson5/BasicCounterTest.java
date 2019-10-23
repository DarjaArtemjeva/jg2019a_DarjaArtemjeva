package lv.jg.lesson5;

public class BasicCounterTest {
    public static void main(String[] args) {

        shouldIncrementCounterByOne();
        shouldBeDefaultValueZero();
        shouldDecrementCounterByOne();
        shouldClearCounterValue();
        shouldSetPositiveCounterValue();
        shouldBeZeroWhenSetNegativeValue();
    }

    private static void shouldBeZeroWhenSetNegativeValue() {
        BasicCounter counter = new BasicCounter();
        counter.setValue(-10);
        int result = counter.getValue();
        int expectedResult = 0;

        printResult(result, expectedResult, "shouldBeZeroWhenSetNegativeValue");
    }

    private static void printResult(int result, int expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println("Test " + testName + ":" + " Passed ");
        } else {
            System.out.println("Test " + testName + ":" + " failed -> " + "Actual result is " + result);
        }
    }

    private static void shouldSetPositiveCounterValue() {
        BasicCounter counter = new BasicCounter();
        counter.setValue(10);
        int result = counter.getValue();
        int expectedResult = 10;

        printResult(result, expectedResult, "shouldSetPositiveCounterValue");
    }

    private static void shouldClearCounterValue() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.clear();
        int result = counter.getValue();
        int expectedResult = 0;

        printResult(result, expectedResult, "shouldClearCounterValue");
    }

    private static void shouldDecrementCounterByOne() {
        BasicCounter counter = new BasicCounter();
        int result = counter.getValue();
        counter.decrement();
        int expectedResult = 0;

        printResult(result, expectedResult, "shouldDecrementCounterByOne");
    }

    private static void shouldBeDefaultValueZero() {
        BasicCounter counter = new BasicCounter();
        int result = counter.getValue();
        int expectedResult = 0;

        printResult(result, expectedResult, "shouldBeDefaultValueZero");
    }

    private static void shouldIncrementCounterByOne() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        int result = counter.getValue();
        int expectedResult = 1;

        printResult(result, expectedResult, "shouldIncrementCounterByOne");
    }
}
