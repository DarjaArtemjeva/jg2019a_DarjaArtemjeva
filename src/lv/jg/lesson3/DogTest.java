package lv.jg.lesson3;

import javafx.scene.paint.Color;

import java.time.LocalDate;

public class DogTest {

    public static void main(String[] args){

        Dog bob = new Dog ("Bob", Color.BEIGE);

        Dog rex = new Dog("Rex", 2015);
        rex.setColor(java.awt.Color.black);
        rex.eat();
        rex.sleep();
        rex.voice();

        System.out.println("Today is year: " + LocalDate.now().getYear());
        System.out.println("Dog's age is: " + rex.getAge() + " years old");

        doDogRoutine();


    }

    private static void doDogRoutine() {
        Dog bob = new Dog ("Bob", Color.BEIGE);
        bob.eat();
        bob.sleep();
        bob.voice();

        System.out.println("The dog is " + bob.getAge() + "  years old ");
        System.out.println("My name is " + bob.getName());
        System.out.println("My color is  " + bob.getColor());
    }
}
