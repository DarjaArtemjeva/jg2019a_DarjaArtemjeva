package lv.jg.lesson2;

import java.util.Random;
//OK
public class RandomGen {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(11);
        //i love erika  - ????
        System.out.println("Random number is: " + randomNumber);



    }
}
