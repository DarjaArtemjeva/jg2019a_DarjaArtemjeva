package lv.jg.homeWork.NumberService;

import java.util.Scanner;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.sumInRange();
    }
    private void sumInRange() {
        NumberService numberService = new NumberService();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter firs number: ");
            int first = scanner.nextInt();
            System.out.println("Enter second number: ");
            int second = scanner.nextInt();
        numberService.getEvenNumberCount(first, second);
    }

}
