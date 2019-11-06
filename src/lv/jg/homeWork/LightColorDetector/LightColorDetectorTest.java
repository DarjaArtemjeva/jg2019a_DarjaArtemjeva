package lv.jg.homeWork.LightColorDetector;

import java.util.Scanner;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wave length from 380 to 750: "); //user pats ievada vilna garumu
        int length = scanner.nextInt();
        System.out.println("You entered: " + length);

        LightColorDetector lightColorDetector = new LightColorDetector();
        String detect = lightColorDetector.detect(length);
        System.out.println("Result is: " + detect);
    }
}
