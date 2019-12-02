package lv.jg.homeWork.CircleArea;

//Ok
public class Circle {

    //klases mainīgajiem ir jābūt "private", un piekļuve tiem notiek izmantojot metodes
    double radius;

    //getters un seters nav vaadzīgs, jo netiek izmantots
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}





