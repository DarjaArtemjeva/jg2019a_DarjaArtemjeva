package lv.jg.homeWork;

import java.util.Scanner;

//Ok
public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius: ");
        double number = scanner.nextDouble();

        double result = circle.calculateArea(number);

        System.out.println("Circle area is: " + result);
    }
}

