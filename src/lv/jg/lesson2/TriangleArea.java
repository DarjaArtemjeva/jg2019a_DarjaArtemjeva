package lv.jg.lesson2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //nolasa no tastaturas ievaditus datus

        System.out.println("Enter triangle height");
        double height = scanner.nextDouble();

        System.out.println("Enter triangle width");
        double width = scanner.nextDouble();

        double area = height * width / 2;

        System.out.println("Triangle area is: " + area);



//        Random randomGenerator = new Random();
//
//        double height = randomGenerator.nextInt(21);
//        double width = randomGenerator.nextInt(21);
//
//        double area = (height*width)/2;
//
//        System.out.println("Height: " + height);
//        System.out.println("Width: " + width);
//        System.out.println("Triangle area is: " + area);
    }
}
