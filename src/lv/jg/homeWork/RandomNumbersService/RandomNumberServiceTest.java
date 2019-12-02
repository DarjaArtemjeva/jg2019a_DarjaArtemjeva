package lv.jg.homeWork.RandomNumbersService;

import java.util.Random;

public class RandomNumberServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int number = randomGenerator.nextInt(101);
    }
}
