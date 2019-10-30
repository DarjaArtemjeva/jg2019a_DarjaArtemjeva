package lv.jg.lesson6;

public class MultiplicationTableTest {
    public static void main(String[] args) {
        MultiplicationTableTest testRunner = new MultiplicationTableTest();
        testRunner.shouldPrintMultiplicationTable();

    }

    private void shouldPrintMultiplicationTable() {
        MultiplicationTable table = new MultiplicationTable();
        table.print(5);

    }
}
