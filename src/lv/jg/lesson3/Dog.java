package lv.jg.lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;
import java.time.LocalDate;

public class Dog {
    private int yearOfBirth;
    private String name;
    private Color color;


    public Dog(String name, int yearOfBirth) {
        this.yearOfBirth = yearOfBirth; // this. - attiecas un visiem konstruktoriem
        this.name = name;                               // ...= yearOfBirth attiecas tikai uz public Dog(int)
    }

    public Dog(String bob, javafx.scene.paint.Color beige) {
        this.name = name;
        this.color = color;
    }

    public int getAge () {
        int age = LocalDate.now().getYear() - yearOfBirth;
        return age;
    }

    public String getName() {
//        System.out.println("Enter dogs name: ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
        return this.name;
    }

    public Color getColor(){
        return this.color;
    }

    public void voice () {
        System.out.println("Vau Vau");
    }

    public void eat () {
        System.out.println("Nom-Nom");
    }
    public void sleep () {
        System.out.println("ZzzZzz...");
    }
    public void setColor(Color color) {
        this.color = color;

    }
}

