package lv.jg.homeWork;

import java.util.Random;

//OK
public class Calculations {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        double firstNum = randomGenerator.nextInt(51);
        double secNum = randomGenerator.nextInt(51);

        double sum = firstNum + secNum;
        double substract = firstNum - secNum;  //typo "substract"
        double multiply = firstNum * secNum;
        double div = firstNum / secNum;


        System.out.println("First operand: " + firstNum);
        System.out.println("Second operand: " + secNum);

        System.out.println("Sum Result: " + sum);
        System.out.println("Substract Result: " + substract);  //typo "Substract"
        System.out.println("Multiply Result: " + multiply);
        System.out.println("Divide Result: " + div);

    }
}
