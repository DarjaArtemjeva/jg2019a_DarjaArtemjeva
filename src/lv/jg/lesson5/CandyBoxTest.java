package lv.jg.lesson5;

public class CandyBoxTest {
    public static void main(String[] args) {
        CandyBox prozitBox = new CandyBox("Prozit", 8);
        CandyBox prozitBoxBig = new CandyBox("Prozit", 16);
        boolean expectedResult = true;

        System.out.println("CandyBox equals true Test");
        boolean actualResult = prozitBox.equals(prozitBoxBig); //salidzinajums

        if (actualResult) {
            System.out.println("Passed");

        } else {
            System.out.println("FAILED!");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual: " + actualResult);
        }
        System.out.println(prozitBox);
        System.out.println(prozitBoxBig);
    }
}
