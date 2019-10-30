package lv.jg.lesson6;

public class MultiplicationTable {

    public void print(int size) {

        printHeaders(size);

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.format("%4d", calculate(i, j));
            }
            System.out.println();
        }
    }
    private void printHeaders(int size){
        for (int i=1; i<=size; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();

        for (int i=0; i<size; i++) {
            System.out.print("-----");
        }
        System.out.println();
    }

    private int calculate(int i, int j) {
        return i * j;
    }
}
