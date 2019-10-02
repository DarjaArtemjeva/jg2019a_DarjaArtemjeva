package lv.jg.lesson2;

public class FloatingDivision {
    public static void main(String[] args) {

        int a, b, resultIntDiv;       //ctrl+d - kopē tādu pašu veselu rindu
        double resultDoubleDiv, resultCastDiv;

        a = 10;
        b = 4;

        resultIntDiv = a / b;
        resultDoubleDiv = a / b;
        resultCastDiv = a / (double) b;

        System.out.println("IntDiv: " + resultIntDiv);
        System.out.println("DoubleDiv: " + resultDoubleDiv);
        System.out.println("CastDiv: " + resultCastDiv);




    }
}
